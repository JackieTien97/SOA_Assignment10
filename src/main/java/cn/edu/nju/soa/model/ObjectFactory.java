//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.03.06 时间 03:21:28 PM CST 
//


package cn.edu.nju.soa.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.edu.nju.soa.xsd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of model derived interfaces
 * and classes representing the binding of model
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _COURSE_INFO_QNAME = new QName("http://jw.nju.edu.cn/model", "课程信息");
    private final static QName _STUDENT_INFO_QNAME = new QName("http://jw.nju.edu.cn/model", "学生信息");
    private final static QName _PERSON_INFO_QNAME = new QName("http://www.nju.edu.cn/model", "人员信息");
    private final static QName _STUDENT_LIST_QNAME = new QName("http://jw.nju.edu.cn/model", "学生列表");
    private final static QName _COURSE_SCORE_LIST_QNAME = new QName("http://jw.nju.edu.cn/model", "课程成绩列表");
    private final static QName _TEACHER_INFO_QNAME = new QName("http://jw.nju.edu.cn/model", "教师信息");
    private final static QName _DEPARTMENT_INFO_QNAME = new QName("http://www.nju.edu.cn/model", "部门信息");

    /**
     * Create a new ObjectFactory that can be used to create new instances of model derived classes for package: cn.edu.nju.soa.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CourseScoreList }
     * 
     */
    public CourseScoreList createCourseScoreList() {
        return new CourseScoreList();
    }

    /**
     * Create an instance of {@link TeacherInfoType }
     * 
     */
    public TeacherInfoType createTeacherMessageType() {
        return new TeacherInfoType();
    }

    /**
     * Create an instance of {@link StudentList }
     * 
     */
    public StudentList createStudentList() {
        return new StudentList();
    }

    /**
     * Create an instance of {@link StudentInfo }
     * 
     */
    public StudentInfo createStudentInfo() {
        return new StudentInfo();
    }

    /**
     * Create an instance of {@link CourseInfo }
     * 
     */
    public CourseInfo createCourseInfo() {
        return new CourseInfo();
    }

    /**
     * Create an instance of {@link StudentGrade }
     * 
     */
    public StudentGrade createStudentGrade() {
        return new StudentGrade();
    }

    /**
     * Create an instance of {@link StudentScore }
     * 
     */
    public StudentScore createStudentScore() {
        return new StudentScore();
    }

    /**
     * Create an instance of {@link CourseTimeAndAddress }
     * 
     */
    public CourseTimeAndAddress createCourseTimeAndAddress() {
        return new CourseTimeAndAddress();
    }

    /**
     * Create an instance of {@link StudentBasicInformation }
     * 
     */
    public StudentBasicInformation createStudentBasicInformation() {
        return new StudentBasicInformation();
    }

    /**
     * Create an instance of {@link CourseScore }
     * 
     */
    public CourseScore createCourseScore() {
        return new CourseScore();
    }

    /**
     * Create an instance of {@link ScoreDetailType }
     * 
     */
    public ScoreDetailType createScoreDetailType() {
        return new ScoreDetailType();
    }

    /**
     * Create an instance of {@link DepartmentStu }
     * 
     */
    public DepartmentStu createDepartmentStu() {
        return new DepartmentStu();
    }

    /**
     * Create an instance of {@link ScoreType }
     * 
     */
    public ScoreType createScoreType() {
        return new ScoreType();
    }

    /**
     * Create an instance of {@link DepartmentInfo }
     * 
     */
    public DepartmentInfo createDepartmentInfo() {
        return new DepartmentInfo();
    }

    /**
     * Create an instance of {@link PersonInfo }
     * 
     */
    public PersonInfo createPersonInfo() {
        return new PersonInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CourseInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/model", name = "课程信息")
    public JAXBElement<CourseInfo> createCourseInfo(CourseInfo value) {
        return new JAXBElement<CourseInfo>(_COURSE_INFO_QNAME, CourseInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/model", name = "学生信息")
    public JAXBElement<StudentInfo> createStudentInfo(StudentInfo value) {
        return new JAXBElement<StudentInfo>(_STUDENT_INFO_QNAME, StudentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/model", name = "人员信息")
    public JAXBElement<PersonInfo> createPersonInfo(PersonInfo value) {
        return new JAXBElement<PersonInfo>(_PERSON_INFO_QNAME, PersonInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/model", name = "学生列表")
    public JAXBElement<StudentList> createStudentListType(StudentList value) {
        return new JAXBElement<StudentList>(_STUDENT_LIST_QNAME, StudentList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CourseScoreList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/model", name = "课程成绩列表")
    public JAXBElement<CourseScoreList> createCourseScoreList(CourseScoreList value) {
        return new JAXBElement<CourseScoreList>(_COURSE_SCORE_LIST_QNAME, CourseScoreList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TeacherInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/model", name = "教师信息")
    public JAXBElement<TeacherInfoType> createTeacherInfoType(TeacherInfoType value) {
        return new JAXBElement<TeacherInfoType>(_TEACHER_INFO_QNAME, TeacherInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepartmentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/model", name = "部门信息")
    public JAXBElement<DepartmentInfo> createDepartmentInfo(DepartmentInfo value) {
        return new JAXBElement<DepartmentInfo>(_DEPARTMENT_INFO_QNAME, DepartmentInfo.class, null, value);
    }

}
