public class ArrayTest {

    //1.一维数组的声明和初始化
    int num;//声明
    num = 10;//初始化
    int id = 1001;//声明+初始化

    int[] ids;//声明
    //1.1静态初始化：数组的初始化和数组元素的赋值操作分开进行
    ids = new int[] {1001,1002,1003,1004}
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

	        for(int i = 0; i< names.lenght; i++) {
        System.out.println(names[i]);

    }

}

			}

                    }

                    }
                    }
