package com.restservice.RestfulwebService;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restservice.RestfulwebService.bean.Todos;
@Service
public class TodosHardCodedService {
	private static int idCounter=0;
	private static List<Todos> todos=new ArrayList();
static
{
	todos.add(new Todos(++idCounter,"in28Minutes","Learn to Run",new Date(),false));
	todos.add(new Todos(++idCounter,"in28Minutes","Learn to Code",new Date(),false));

	todos.add(new Todos(++idCounter,"in28Minutes","Learn to dance",new Date(),false));
}
public List<Todos> findAll()
{
	return todos;
}
public Todos findById(long id)
{
	Todos tds=null;
	for(Todos td:todos)
	{
		if(td.getId()==id)
		{
			tds=td;
			break;
		}
			
	}
	return tds;
}
public Todos save(Todos td)
{
	Todos t=null;
	int i=0;
	if(td.getId()==0 || td.getId()==-1)
	{
		td.setId(++idCounter);
		todos.add(td);
	}
	else
	{
		this.deleteById(td.getId());
		todos.add(td);
	}
	return this.findById(td.getId());
}
public int  deleteById(long id)
{
	Iterator it=todos.iterator();
	int i=0;
	while(it.hasNext())
	{
		Todos td=(Todos)it.next();
		if(td.getId()==id)
		{
			it.remove();
			i=1;
		}
	}
	return i;
}
}
