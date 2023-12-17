package pr_18;

public class ThrowsDemo5 {
    public void getDetails(String key) {
        /* 1
        if(key == null) {
            throw newNullPointerException("null key in getDetails");
        }
        */
        //2
        try {
            if (key == null)
                throw new NullPointerException("null key in getDetails");
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
        System.out.println("Ключ: " + key);
        System.out.println("hello");
    }

    public static void main(String[] args) {
        ThrowsDemo5 obj = new ThrowsDemo5();
        obj.getDetails(null);
    }
}
