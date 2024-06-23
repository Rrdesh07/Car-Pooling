package com.Rrdesh07.CarPooling.service.request;

import com.Rrdesh07.CarPooling.Models.Request;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface RequestService {
    List<Request> getAllRequests(Long userId);
    Request addRequest(Long userId, @RequestBody Request request);
    Request updateRequest(Long userId,Long requestId,@RequestBody Request request);
    String deleteRequest(Long requestId);
}
