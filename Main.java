import Adaptees.AttendanceSystem;
import Adaptees.GradingSystem;
import Adaptees.LibrarySystem;
import Adapters.AttendanceSystemAdapter;
import Adapters.GradingSystemAdapter;
import Adapters.LibrarySystemAdapter;
import Adapters.SchoolManagementApp;

public class Main {
   void main() {
       AttendanceSystem attendanceSystem = new AttendanceSystem();
       GradingSystem gradingSystem = new GradingSystem();
       LibrarySystem librarySystem = new LibrarySystem();

       SchoolManagementApp attendanceAdapter = new AttendanceSystemAdapter(attendanceSystem);
       SchoolManagementApp gradingAdapter = new GradingSystemAdapter(gradingSystem);
       SchoolManagementApp libraryAdapter = new LibrarySystemAdapter(librarySystem);

       attendanceAdapter.integrateSystem();
       gradingAdapter.integrateSystem();
       libraryAdapter.integrateSystem();
    }
}