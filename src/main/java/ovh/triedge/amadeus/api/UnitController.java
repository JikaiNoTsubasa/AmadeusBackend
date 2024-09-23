package ovh.triedge.amadeus.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import ovh.triedge.amadeus.model.Unit;
import ovh.triedge.amadeus.service.UnitService;

@RestController
@RequestMapping("/unit")
public class UnitController {

	@Autowired
	private UnitService unitService;
	
	
	@GetMapping
	public List<Unit> findAll(){
		return unitService.findAll();
	}
	
	@GetMapping("/{id}")
    public Optional<Unit> findById(@PathVariable Long id) {
        return unitService.findById(id);
    }
	
	// create a unit
    @ResponseStatus(HttpStatus.CREATED) // 201
    @PostMapping
    public Unit create(@RequestBody Unit unit) {
        return unitService.save(unit);
    }
    
    // update a book
    @PutMapping
    public Unit update(@RequestBody Unit unit) {
        return unitService.save(unit);
    }

    // delete a book
    @ResponseStatus(HttpStatus.NO_CONTENT) // 204
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        unitService.deleteById(id);
    }
    
    /*
    @GetMapping("/find/title/{title}")
    public List<Book> findByTitle(@PathVariable String title) {
        return bookService.findByTitle(title);
    }

    @GetMapping("/find/date-after/{date}")
    public List<Book> findByPublishedDateAfter(
            @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date) {
        return bookService.findByPublishedDateAfter(date);
    }
    */
}
