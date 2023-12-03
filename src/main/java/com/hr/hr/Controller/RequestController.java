package com.hr.hr.Controller;

import com.hr.hr.Entity.Request;
import com.hr.hr.Service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/request")
public class RequestController {
    @Autowired
    private RequestService requestService;
    @PostMapping
    public Request createRequest(@RequestBody Request request) {
        return requestService.createRequest(request);
    }

    @GetMapping("/{id}")
    public Request getRequestById(@PathVariable Long id) {
        return requestService.getRequestById(id);
    }

    @GetMapping
    public List<Request> getAllRequests() {
        return requestService.getAllRequests();
    }

    @PutMapping("/{requestId}")
    public Request updateRequest(@PathVariable Long requestId, @RequestBody Request request) {
        Request.setId(requestId);
        return requestService.updateRequest(request);
    }

    @DeleteMapping("/{id}")
    public void deleteRequest(@PathVariable Long id) {
        requestService.deleteRequest(id);
    }
}
