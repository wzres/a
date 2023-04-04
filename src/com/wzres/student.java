package com.wzres;

/**
 * @ClassName：student
 * @description：
 * @date：2023-04-05 02:19
 */
public class student {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        student student = new student();
        student.setId(1);
        student.setName("张三");
        System.out.println(student);
    }
}
