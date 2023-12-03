package com.hr.hr.Service;

import com.hr.hr.Entity.Request;

import java.util.List;

public interface RequestService {
    Request createRequest(Request request);
    Request updateRequest(Request request);
    Request getRequestById(Long requestId);
    List<Request> getAllRequests();
    void deleteRequest(Long requestId);
}
