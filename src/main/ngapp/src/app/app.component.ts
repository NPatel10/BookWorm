import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'app';
	hero: any;
	constructor(private http: HttpClient) { }
	ngOnInit(){
		console.log("runuoasdjfg");
		this.getHero().subscribe(
			hero => console.log(hero)
		);
	}

	getHero(){
		return this.http.get("http://localhost:8080/hello");
	}

}
