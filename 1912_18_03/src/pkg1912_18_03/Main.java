/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Bài tập môn ADF1 ngày 16-03-2020
//Viết chương trình quản lý thông tin học viên của một trung tâm gia sư. Một học viên bao gồm thông tin: mã số học viên, họ tên, ngày sinh, giới tính, quê quán, điểm của ba môn học chính. Trong đó mã học viên là số nguyên tự động tăng khi tạo đối tượng.Thông tin học viên sẽ được nhập vào đầu khoá học khi học viên đăng ký. Vào cuối khoá học, trung tâm muốn tìm ra một số học viên có thành tích học tập tốt để trao học bổng khuyến khích. Một học viên được đánh giá là tốt nếu điểm trung bình ba môn học chính từ 8.0 trở lên và không có môn nào trong ba môn chính điểm dưới 5. Chương trình bao gồm các chức năng sau:
//- Nhập danh sách học viên.
//- Nhập điểm cho các học viên.
//- Hiển thị danh sách học viên, mỗi học viên hiển thị thông tin họ tên, quê quán, ngày sinh điểm các môn học (nếu có).
//- Xác định danh sách học viên để trao học bổng.

package pkg1912_18_03;

public class Main {


    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.showMenu();
    }
    
}
