package com.cbfacademy.restapiexercise.ious;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/ious")

public class IOUController {
    private IOUService iouService;

    public IOUController(IOUService iouService) {
        this.iouService = iouService;
    }

    @GetMapping
    public List<IOU> getAllIOUs() {
        try {
            return iouService.getAllIOUs();
        } catch (RuntimeException e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);
        }

    }

    @GetMapping("/{id}")
    public IOU getIOU(@PathVariable UUID id) {
        try {
            return iouService.getIOU(id);
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage(), e);
        } catch (RuntimeException e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);
        }
    }

    @PostMapping
    public ResponseEntity<IOU> createIOU(@RequestBody IOU iou) {
        try {
            IOU createIou = iouService.createIOU(iou);

            return ResponseEntity.status(HttpStatus.CREATED).body(createIou);
        } catch (RuntimeException exception) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // http:localhost:8080/UUID/update/{"id"}
    @PutMapping("/{id}")
    public IOU updateIOU(@PathVariable UUID id, @RequestBody IOU iou) {
        try {
            return iouService.updateIOU(id, iou);
        } catch (IllegalArgumentException exception) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, exception.getMessage());
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteIou(@PathVariable UUID id) {
        try {
            iouService.deleteIOU(id);
            return ResponseEntity.noContent().build();
        } catch (NoSuchElementException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "IOU not found", exception);
        } catch (RuntimeException exception) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(), exception);
        }

    }

}
