public class uranai {
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
    System.out.println ( age + "�΂�" + name + "����A���Ȃ��̉^�C�ԍ���" + fortune + "�ł�");
    System.out.println("1: ��g���@2: ���g�@3:�g�@4:���@5:�������߂��E�E�E�I�V�}�C�_(;��;)");
 }
}