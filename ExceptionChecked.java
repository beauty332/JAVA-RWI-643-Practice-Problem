class ExceptionChecked {
    public static void main(String[] args)
        throws ClassNotFoundException
    {
        try {
            Class temp = Class.forName(
                "Railworld");
        }

        catch (ClassNotFoundException e) {
            System.out.println(
                "Class does not exist check the name of the class");
        }
    }
}