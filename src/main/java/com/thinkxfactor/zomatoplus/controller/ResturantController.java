package com.thinkxfactor.zomatoplus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.models.Resturant;
import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repository.ItemRepository;
import com.thinkxfactor.zomatoplus.repository.ResturantRepository;
import com.thinkxfactor.zomatoplus.repository.UserRepository;


@RestController
@RequestMapping("/resturant")

public class ResturantController 
{
	@Autowired
	private ResturantRepository resturantRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	@PostMapping("/add")
	public Resturant addResturant(@RequestBody Resturant resturant) {
		Resturant persistedResturant=resturantRepository.save(resturant);
		return persistedResturant;
	}
	
	@GetMapping("/getAll")
	public List<Resturant> getAll(){
		List<Resturant> listofresturants=resturantRepository.findAll();
		
		return listofresturants;
	}
	
	@PostMapping("/addItem")
	public Items addItem(@RequestBody Items item)
	{
		Items persistedItem=itemRepository.save(item);
		return persistedItem;
	}
	
	@GetMapping("/getAllItem")
	public List<Items> getAllItem(){
		List<Items> listofitems=itemRepository.findAll();
		
		return listofitems;
	}
}