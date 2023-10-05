package HW3;

import HW3.Study.Stream;
import HW3.Study.StreamService;
import HW3.Study.Student;
import HW3.Study.StudyGroup;

import static HW3.Utils.AutoGenerate.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student = getRandomStudent();
        System.out.println(student);

        StudyGroup studyGroup = getRandomStudyGroup(10, 103);
        System.out.println(studyGroup);

        Stream stream = getRandomStream(4, 7,12);
        System.out.println(stream);

        System.out.println("<>".repeat(30));
        List<Stream> streams = getRandomStreamList(6,4, 10,4,12);
        for (Stream instream : streams) {
            System.out.printf("ID: %s. Stream group count: %s%n",instream.getId(), instream.getGroupsCount());
        }
        StreamService streamService = new StreamService();
        System.out.println("<".repeat(10) + " Sorted " + ">".repeat(10));
        streamService.sortStreams(streams);
        for (Stream instream : streams) {
            System.out.printf("ID: %s. Stream group count: %s%n",instream.getId(), instream.getGroupsCount());
        }

    }
}