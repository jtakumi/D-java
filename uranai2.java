public class uranai2 {
  public static void main(String[] args) {
    System.out.println("�悤�����B�肢�̊ق�");
    System.out.println("���Ȃ��̂����O�́H");
    String name = new java.util.Scanner (
     System.in ).nextLine ( );
    System.out.println("���Ȃ��̂��N��́H");
    String ageString = new java.util.Scanner (
     System.in ).nextLine ( );
    int age = Integer.parseInt ( ageString );
    int fortune = new java.util.Random ( ).nextInt ( 4 );
    fortune++;
    System.out.println ("���ʂ��o�܂���");
    if(fortune == 1) {
    System.out.println ( age + "�΂�" + name + "����A���Ȃ��̉^�C�͑�g�ł�");
  }
    if(fortune == 2){
    System.out.println ( age + "�΂�" + name + "����A���Ȃ��̉^�C�͒��g�ł�");
    }
    if(fortune == 3){
    System.out.println ( age + "�΂�" + name + "����A���Ȃ��̉^�C�͋g�ł�");
    }
    if(fortune ==4){
    System.out.println ( age + "�΂�" + name + "����A���Ȃ��̉^�C�͋��ł�");
    }
    if(fortune ==5){
    System.out.println ( age + "�΂�" + name + "����A���Ȃ��̉^�C�͑�ςȂ��ƂɂȂ��Ă���悤�ł��B\n�_�Ђł��P���������Ă�������");
 }
 System.out.println ( "�����p���肪�Ƃ��������܂����B");
   }
}