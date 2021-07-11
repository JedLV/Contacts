public class ArrayTest {
    public static void main(String[] args) {

        //1.一维数组的声明和初始化
        int num;//声明
        num = 10;//初始化
        int id = 1001;//声明+初始化

        int[] ids;//声明
        //1.1静态初始化：数组的初始化和数组元素的赋值操作分开进行
        ids = new int[] {1001,1002,1003,1004};
        //1.2动态初始化：数组的初始化和数组元素的赋值操作分开进行
        String[] names = new String[5];

        //总结：数组一旦初始化完成，其长度就确定了。


        //2.如何调用数组的指定位置的元素：通过角标的方式调用。
        //数组的角标（或索引）从0开始的，到数组的长度-1结束。
        names[0] = "常凯申";
        names[1] = "李德胜";
        names[2] = "张学良";
        names[3] = "杨虎城";
        names[4] = "老算盘";//charAt(0)
        //	name[5] = "队形";


        //3.如何获取数组的长度。
        //属性：length
        System.out.println(names.length);//5
        System.out.println(ids.length);


        //4.如何遍历数组
	    /*    System.out.println(names[0]);
	        System.out.println(names[1]);
	        System.out.println(names[2]);
	        System.out.println(names[3]);
	        System.out.println(names[4]);
	        */

        for(int i = 0; i< names.length; i++) {
            System.out.println(names[i]);


        //5.数组元素的默认初始化值
            //① 数组元素是整型：0
            //② 数组元素是浮点型：0.0
            //③ 数组元素是char型：0或'\u0000',而非'0'
            //④ 数组元素是boolean型：false
            //⑤ 数据元素是引用数据类型：null

         //6.数组的内存解析
        int[] arr = new int[4];
        for (int i1 = 0; i1 < arr.length; i++){
            System.out.println(arr[i1]);
        }
        System.out.println("**********");

        short[] arr1 = new short[4];
        for (int i1 = 0; i < arr1.length; i++){
            System.out.println(arr1[i1]);

        }
            System.out.println("**********");
            float[] arr2 = new float[5];
            for (int i1 = 0; i < arr2.length; i++){
                System.out.println(arr2[i1]);
            }
            System.out.println("**********");
            char[] arr3 = new char[4];
            for (int i1 = 0; i < arr3.length; i++){
                System.out.println(arr3[i1]);
            }
            System.out.println("**********");
            boolean[] arr4 = new boolean[5];
                System.out.println(arr4[0]);

            System.out.println("**********");
            String[] arr5 = new String[5];
                System.out.println(arr5[0]);
                if (arr5[0] == null){
                    System.out.println("今天天气不错！");
            }
            }
        }


    }








