package employeewage;

public class UC3 {
        public static void main(String[] args) {
                int empcheck = 1;
                int fulltime = 8;
                int employeehours = 8;
                int eployeewage = 0;
                double val = Math.floor(Math.random() * 10) % 3;
                if (empcheck == fulltime) {
                        employeehours = 8;

                }else {
                        employeehours = 0;

                }
                int employeewage = employeehours * employeehours;
                System.out.println(employeewage);
                switch ((int) empcheck){
                        case 0:
                                employeehours=0;
                                break;
                        case 1:
                                employeehours=4;
                                break;
                        case 2:
                                employeehours=8;
                                break;
                        default:
                                System.out.println("Invalid Choice");
                                break;
                }
                employeewage = employeehours * employeehours;
                System.out.println("employeewage");
        }
        }
