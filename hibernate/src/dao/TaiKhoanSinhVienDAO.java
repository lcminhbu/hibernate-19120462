package dao;

import Util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import pojo.Taikhoansinhvien;

import java.util.List;

public class TaiKhoanSinhVienDAO {
    public static List<Taikhoansinhvien> getAllStudent() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Taikhoansinhvien> tksv = null;
        try {
            final String hql = "select tksv from Taikhoansinhvien tksv";
            Query query = session.createQuery(hql);
            tksv = query.list();
        } catch (HibernateException e) {
            System.err.println(e);
        } finally {
            session.close();
        }
        return tksv;
    }
}
