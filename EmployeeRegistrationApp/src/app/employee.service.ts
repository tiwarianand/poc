import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';

@Injectable()
export class EmployeeService {

  constructor(private http : HttpClient) { }
  baseUrlgetAllEmployeeUrl: string = 'http://localhost:8080/getAllEmployees';
  baseUrlsaveEmployeeUrl: string = 'http://localhost:8080/saveEmployee';
  
  getAllEmployees(){
	  return this.http.get(this.baseUrlgetAllEmployeeUrl);
  }

  saveEmployee(data){
    console.log(data);
	  return this.http.post(this.baseUrlsaveEmployeeUrl,data);
  }

}
