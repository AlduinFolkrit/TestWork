package ru.k2.pharmacy_hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.k2.pharmacy_hospital.dao.HibernateDao;
import ru.k2.pharmacy_hospital.domain.Person;

import java.util.List;

@Service
@Transactional
public class PharmacyServiceImpl implements PharmacyService{


    private HibernateDao pharmacyDao;

    @Autowired
    public void setPharmacyDao(HibernateDao pharmacyDao) {
        this.pharmacyDao = pharmacyDao;
    }

    @Override
    public List<Person> findAll() {
        return pharmacyDao.getSession().createCriteria(Person.class).list();
    }
}
