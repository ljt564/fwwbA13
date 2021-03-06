package com.zust.stkdy.testsystem.service;

import com.zust.stkdy.testsystem.TestSystemApplication;
import com.zust.stkdy.testsystem.entity.Teacher;
import org.springframework.stereotype.Service;

public interface TeacherService {
    public Teacher findTeacherByToken(String token);
    public Teacher findTeacherById(Teacher teacher);
    public int nameBeRegistered(String userName);
    public Teacher updateTokenAndLogin(Teacher teacher);
    public int addTeacher(Teacher teacher);
}
