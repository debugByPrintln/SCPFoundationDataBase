public class Test {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            System.out.println("Идет взлом пентагона: " + i + "%.");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Пентагон успешно взломан!");
    }
}
