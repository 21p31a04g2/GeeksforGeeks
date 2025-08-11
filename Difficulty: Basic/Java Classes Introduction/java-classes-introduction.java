class task {
    int length;
    int width;
    int height;
    public void set_length(int l) {
        // Add your code here.
        length=l;
    }

    public void set_width(int w) {
        // Add your code here.
        width=w;
    }

    public void set_height(int h) {
        // Add your code here.
        height=h;
    }

    public void volume() {
        // Add your code here.
        int vol=length*width*height;
        System.out.println(vol);
    }
}