package cn.arfan.homework.dao;

public interface StudentManager {
    /**
     * 增加学生
     * @return
     */
    public int addStudent();

    /**
     * 删除全部学生
     * @return
     */
    public int deleteAllStudent();

    /**
     * 删除学生
     * @return
     */
    public int deleteStudent();

    /**
     * 修改学生
     * @return
     */
    public int updateStudent();

    /**
     * 查询学生
     */
    public void selectStudent();

    /**
     * 查询所有学生
     */
    public void selectAllStudent();

}
