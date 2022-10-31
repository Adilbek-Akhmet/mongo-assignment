package adilbek.mongoassignment.task1andtask2;

import adilbek.mongoassignment.task1andtask2.mapper.LogMapper;
import adilbek.mongoassignment.task1andtask2.model.Log;
import adilbek.mongoassignment.task1andtask2.repository.LogRepository;
import adilbek.mongoassignment.task4.model.PaymentHistory;
import adilbek.mongoassignment.task4.nosql.Customer;
import adilbek.mongoassignment.task4.nosql.SlrCamera;
import adilbek.mongoassignment.task4.nosql.repository.CameraRepository;
import adilbek.mongoassignment.task4.nosql.repository.CustomerRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
@RequiredArgsConstructor
public class ConsoleProgram {

    private final LogRepository logRepository;
    private final CameraRepository cameraRepository;
    private final CustomerRepository customerRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        logRepository.deleteAll();

        Log log1 = new Log("213.115.98.71", "https://www.google.com/", LocalDateTime.of(2022, 1, 1, 1, 15), "100000");
        Log log2 = new Log("323.444.58.23", "https://moodle.astanait.edu.kz/", LocalDateTime.of(2022, 2, 2, 2, 25), "14500");
        Log log3 = new Log("543.234.53.12", "https://www.youtube.com/", LocalDateTime.of(2022, 3, 3, 3, 35), "121000");
        Log log4 = new Log("653.854.75.32", "https://www.mongodb.com/", LocalDateTime.of(2022, 4, 4, 4, 45), "20000");
        Log log5 = new Log("235.634.59.65", "https://www.linkedin.com/", LocalDateTime.of(2022, 5, 5, 5, 55), "500000");

        Log log6 = new Log("111.111.11.11", "https://www.google.com/", LocalDateTime.of(2022, 1, 1, 1, 15), "100000");
        Log log7 = new Log("111.111.11.11", "https://moodle.astanait.edu.kz/", LocalDateTime.of(2022, 2, 2, 2, 25), "14500");
        Log log8 = new Log("111.111.11.11", "https://www.youtube.com/", LocalDateTime.of(2022, 3, 3, 3, 35), "121000");
        Log log9 = new Log("111.111.11.11", "https://www.mongodb.com/", LocalDateTime.of(2022, 4, 4, 4, 45), "20000");
        Log log10 = new Log("111.111.11.11", "https://www.linkedin.com/", LocalDateTime.of(2022, 5, 5, 5, 55), "500000");

        List<Log> logs = List.of(log1, log2, log3, log4, log5, log6, log7, log8, log9, log10);


        logRepository.saveAll(logs);

        System.out.println("------------------------------------------");
        System.out.println("Task 1: All data");
        print(logRepository.findAll());

        System.out.println("------------------------------------------");
        System.out.println("-------Task 2-------");

        System.out.println("1) Выдать упорядоченный список URL ресурсов");
        logRepository.findAll(Sort.by("url")).stream()
                .map(Log::getUrl)
                .forEach(System.out::println);

        System.out.println("2) Выдать упорядоченный список IP-адресов пользователей, посетивших ресурс с заданным URL");
        System.out.println("EX: Будем искать по https://www.google.com/");
        logRepository.findAllByUrl("https://www.google.com/").stream()
                .map(Log::getIp)
                .forEach(System.out::println);

        System.out.println("3) Выдать упорядоченный список URL ресурсов, посещенных в заданный временной период. ");
        System.out.println("EX: Between 2022-04-04 - 2022-05-05");
        logRepository.findAllByTimeStampBetween(LocalDateTime.of(2022, 4, 4, 0, 0), LocalDateTime.of(2022, 5, 5, 0, 0))
                .stream()
                .map(Log::getUrl)
                .sorted()
                .forEach(System.out::println);

        System.out.println("4) Выдать упорядоченный список URL ресурсов, посещенных пользователем с заданным IP адресом. ");
        System.out.println("EX: IP 111.111.11.11");
        logRepository.findAllByIpOrderByUrl("111.111.11.11").stream()
                .map(Log::getUrl)
                .forEach(System.out::println);


        customerRepository.save(
                new Customer(null, "Astana 1", "8 777 777 77 77", "a1@gmail.com", "Astana 1", new PaymentHistory(null, "Adam 1", 50000.0, "Astana 1"))
        );
        cameraRepository.save(new SlrCamera(null, "Nikon COOLPIX B500 Digital Camera (Black)", 100, "The black COOLPIX B500 Digital Camera from Nikon features a 16MP 1/2.3\" BSI CMOS sensor for high-resolution imagery as well as Full HD 1080p video. ", "Nikon COOLPIX B500 Digital Camera (Black)", "Digital Camera", "no"));


    }

    public static void print(List<Log> logs) {
        ObjectMapper objectMapper = new ObjectMapper();

        logs.stream().map(LogMapper::toDto).forEach(log -> {
            try {
                System.out.println(objectMapper.writeValueAsString(log));
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println();
    }
}
