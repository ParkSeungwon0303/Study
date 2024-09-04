package chapter4.training.training8;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    private Phone[] phones;
    private Scanner scanner;

    public PhoneBook(int count) {
        phones = new Phone[count];
        scanner = new Scanner(System.in);
        for (int i = 0; i < phones.length; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            phones[i] = new Phone(scanner.next(), scanner.next());
        }
        System.out.println("저장되었습니다...");
    }

    public void run() {
        while (true) {
            System.out.print("검색할 이름>>");
            String name = scanner.next();
            boolean flag = false;
            int i = 0;
            for (; i < phones.length; i++) {
                if (phones[i].getName().equals(name)) {
                    flag = true;
                    break;
                } else if(name.equals("그만")) {
                    return;
                }
            }
            if (flag) {
                System.out.println(phones[i].getName() + "의 번호는" + phones[i].getTel());
            } else {
                System.out.println(name + "번호가 없습니다.");
            }


            //
        }
    }

    public static void main(String[] args) {
//        System.out.print("인원수>>");
//        Scanner scanner = new Scanner(System.in);
//        PhoneBook phoneBook = new PhoneBook(scanner.nextInt());
//        phoneBook.run();


        TKPhoneBook phoneBook = new TKPhoneBook();
        Scanner scanner = new Scanner(System.in);

        // 인원 수 입력
        System.out.println("인원 수를 입력하세요: ");
        int count = scanner.nextInt();

        // 사용자 전화번호 정보 입력
        for (int i = 0; i < count; i++) {
            phoneBook.addPhone(new TKPhone(scanner.next(), scanner.next()));
        }

        while (true) {
            String input = scanner.next();

            if (input.equals("stop")) {
                break;
            }

            TKPhone phone = phoneBook.findPhone(input);

            if (phone != null) {
                System.out.println(input + "의 번호는 " + phone.getTel());
            } else {
                System.out.println(input + "의 번호가 없습니다...");
            }
        }
    }
}











class TKPhone {
    private final String name;
    private final String tel;

    public TKPhone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return this.name;
    }

    public String getTel() {
        return this.tel;
    }
}

class TKPhoneBook {
    private final ArrayList<TKPhone> phones;

    public TKPhoneBook() {
        this.phones = new ArrayList<>();
    }

    public void addPhone(TKPhone phone) {
        this.phones.add(phone);
    }

    public TKPhone findPhone(String name) {
        for (TKPhone phone : this.phones) {
            if (phone.getName().equals((name))) {
                return phone;
            }
        }

        return null;
    }
}