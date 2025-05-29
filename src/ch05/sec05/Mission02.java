package ch05.sec05;

public class Mission02 {
    public static void main(String[] args) {
        String fileName = "가나다라.haha.jpeg";
        int lastDotIdx = fileName.lastIndexOf(".");
        String ext = fileName.substring(lastDotIdx + 1); // 확장자 추출!
        System.out.println("ext: " + ext);
    }
}

        /*
        String ext = ".jpeg"; // 확장자 추출 !
        System.out.println(ext.indexOf(".jpeg"));
        System.out.println("ext: " + ext); */