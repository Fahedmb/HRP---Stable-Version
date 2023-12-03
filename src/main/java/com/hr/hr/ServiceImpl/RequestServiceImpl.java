package com.hr.hr.ServiceImpl;

import com.hr.hr.Entity.Request;
import com.hr.hr.Repository.RequestRepository;
import com.hr.hr.Service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestServiceImpl implements RequestService {
    @Autowired
    private RequestRepository requestRepository;

    @Override
    public Request createRequest(Request request) {
        return requestRepository.save(request);
    }

    @Override
    public Request updateRequest(Request request) {
        return requestRepository.save(request);
    }

    @Override
    public Request getRequestById(Long id) {
        return requestRepository.findById(id).orElse(null);
    }

    @Override
    public List<Request> getAllRequests() {
        return requestRepository.findAll();
    }

    @Override
    public void deleteRequest(Long id) {
        requestRepository.deleteById(id);
    }
}
