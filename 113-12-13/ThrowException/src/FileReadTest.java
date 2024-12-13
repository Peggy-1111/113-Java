public class FileReadTest {
    public static void main(String[] atgs){
        try{
            String text=FileUtil.read("cashcard.txt");
            System.out.println(text);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
