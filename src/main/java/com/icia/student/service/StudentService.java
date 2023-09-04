package com.icia.student.service;

import com.icia.student.dto.StudentDTO;
import com.icia.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public StudentDTO save(StudentDTO studentDTO){
        studentRepository.save(studentDTO);
        return studentDTO;
    }

    public List<StudentDTO> findAll(){
        return studentRepository.findAll();
    }

    public StudentDTO findById(Long id) {
        return studentRepository.findById(id);
    }

    public void update(StudentDTO studentDTO) {
        studentRepository.update(studentDTO);
    }

    public void delete(Long id) {
        studentRepository.delete(id);
    }
}
