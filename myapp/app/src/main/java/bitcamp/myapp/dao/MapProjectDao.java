package bitcamp.myapp.dao;

import bitcamp.myapp.command.project.ProjectMemberHandler;
import bitcamp.myapp.vo.Project;
import bitcamp.myapp.vo.User;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MapProjectDao implements ProjectDao {

    private static final String DEFAULT_DATANAME = "projects";
    private int seqNo;
    private Map<Integer, Project> projectMap = new HashMap<>();
    private List<Integer> projectNoList = new ArrayList<>();
    private String path;
    private String dataName;
    private ProjectMemberHandler memberHandler;

    public MapProjectDao(String path, ProjectMemberHandler memberHandler) {
        this(path, DEFAULT_DATANAME);
        this.memberHandler = memberHandler;
    }

    public MapProjectDao(String path, String dataName) {
        try {

            this.path = path;
            this.dataName = dataName;

            XSSFWorkbook workbook = new XSSFWorkbook(path);
            XSSFSheet sheet = workbook.getSheet(dataName);

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                try {
                    Project project = new Project();
                    project.setNo(Integer.parseInt(row.getCell(0).getStringCellValue()));
                    project.setTitle(row.getCell(1).getStringCellValue());
                    project.setDescription(row.getCell(2).getStringCellValue());
                    project.setStartDate(row.getCell(3).getStringCellValue());
                    project.setEndDate(row.getCell(4).getStringCellValue());
                    String[] members = row.getCell(5).getStringCellValue().split(",");

                    for (String memberNo : members) {
                        if (!memberNo.isEmpty()) {
                            User member = memberHandler.getMember(Integer.valueOf(memberNo));
                            if (member != null) {
                                project.getMembers().add(member);
                            }
                        }
                    }
                    projectMap.put(project.getNo(), project);
                    projectNoList.add(project.getNo());

                } catch (Exception e) {
                    System.out.println("데이터 형식이 맞지 않습니다.");
                    e.printStackTrace();
                }
            }
            seqNo = projectNoList.getLast();
        } catch (Exception e) {
            System.out.println("게시글 데이터 로딩 중 오류 발생");
            e.printStackTrace();
        }
    }

    public void save() throws Exception {

        try (FileInputStream in = new FileInputStream(path);
            XSSFWorkbook workbook = new XSSFWorkbook(in);) {

            int sheetIndex = workbook.getSheetIndex(dataName);
            if (sheetIndex != -1) {
                workbook.removeSheetAt(sheetIndex);
            }

            XSSFSheet sheet = workbook.createSheet("projects");

            // 셀 이름 출력
            String[] cellHeaders = {"no", "title", "description", "start_date", "end_date",
                "member"};

            Row headerRow = sheet.createRow(0);
            for (int i = 0; i < cellHeaders.length; i++) {
                headerRow.createCell(i).setCellValue(cellHeaders[i]);
            }

            // 데이터 저장
            int rowNo = 1;
            for (Integer ProjectNo : projectNoList) {
                Project project = projectMap.get(ProjectNo);

                Row dataRow = sheet.createRow(rowNo++);
                dataRow.createCell(0).setCellValue(String.valueOf(project.getNo()));
                dataRow.createCell(1).setCellValue(project.getTitle());
                dataRow.createCell(2).setCellValue(project.getDescription());
                dataRow.createCell(3).setCellValue(project.getStartDate());
                dataRow.createCell(4).setCellValue(project.getEndDate());

                StringBuilder stringBuilder = new StringBuilder();
                for (User member : project.getMembers()) {
                    if (!stringBuilder.isEmpty()) {
                        stringBuilder.append(",");
                    }
                    stringBuilder.append(member.getNo());
                }

                dataRow.createCell(5).setCellValue(stringBuilder.toString());
            }

            // 엑셀 파일로 데이터를 출력하기 전에
            // workbook을 위해 연결한 입력 스트림을 먼저 종료한다.

            in.close();

            try (FileOutputStream out = new FileOutputStream(path)) {
                workbook.write(out);
            }
        }
    }

    @Override
    public boolean insert(Project project) throws Exception {
        project.setNo(++seqNo);
        projectMap.put(project.getNo(), project);
        projectNoList.add(project.getNo());
        return true;
    }

    @Override
    public List<Project> list() throws Exception {
        ArrayList<Project> projects = new ArrayList<>();
        for (Integer projectNo : projectNoList) {
            projects.add(projectMap.get(projectNo));
        }
        return projects;
    }

    @Override
    public Project findBy(int no) throws Exception {
        return projectMap.get(no);
    }

    @Override
    public boolean update(Project project) throws Exception {
        if (!projectMap.containsKey(project.getNo())) {
            return false;
        }

        projectMap.put(project.getNo(), project);
        return true;
    }

    @Override
    public boolean delete(int no) throws Exception {
        if (projectMap.remove(no) == null) {
            return false;
        }
        projectNoList.remove(Integer.valueOf(no));
        return true;
    }
}
