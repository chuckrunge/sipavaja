// lightweight validation for method parameters
//Copyright (C) 2016  Chuck Runge
//Lombard, IL.
//CGRunge001@GMail.com

//This program is free software; you can redistribute it and/or
//modify it under the terms of the GNU General Public License
//as published by the Free Software Foundation; either version 2
//of the License, or (at your option) any later version.

//This program is distributed in the hope that it will be useful,
//but WITHOUT ANY WARRANTY; without even the implied warranty of
//MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//GNU General Public License for more details.

//You should have received a copy of the GNU General Public License
//along with this program; if not, write to the Free Software
//Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.

package com.cgrunge;

import java.util.*;

public class validationError {

	public validationError(){}

	boolean validation(Object obj) {
		return validate(obj);
	}

	boolean validation(Object obj1, Object obj2) {
		if(validate(obj1) && validate(obj2) )
			return true;
		else
			return false;
	}

	boolean validation(Object obj1, Object obj2, Object obj3) {
		if(validate(obj1) && validate(obj2) && validate(obj3) )
			return true;
		else
			return false;
	}

	boolean validation(Object obj1, Object obj2, Object obj3, Object obj4) {
		if(validate(obj1) && validate(obj2) && validate(obj3) && validate(obj4) )
			return true;
		else
			return false;
	}

	boolean validation(Object obj1, Object obj2, Object obj3, Object obj4, Object obj5) {
		if(validate(obj1) && validate(obj2) && validate(obj3) && validate(obj4) )
			return true;
		else
			return false;
	}

	boolean validation(Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
		if(validate(obj1) && validate(obj2) && validate(obj3) && validate(obj4) && validate(obj5) && validate(obj6) )
			return true;
		else
			return false;
	}

	boolean validation(Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
		if(validate(obj1) && validate(obj2) && validate(obj3) && validate(obj4) && validate(obj5) && validate(obj6) && validate(obj7) )
			return true;
		else
			return false;
	}

	boolean validation(Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
		if(validate(obj1) && validate(obj2) && validate(obj3) && validate(obj4) && validate(obj5) && validate(obj6) && validate(obj7) && validate(obj8))
			return true;
		else
			return false;
	}

	boolean validation(Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
		if(validate(obj1) && validate(obj2) && validate(obj3) && validate(obj4) && validate(obj5) && validate(obj6) && validate(obj7) && validate(obj8) && validate(obj9))
			return true;
		else
			return false;
	}

	boolean validate(Object obj) {

		if(obj == null) return false;
		
	//  if (element instanceof Integer)

		if(obj.toString().isEmpty()) {
			return false;
		}

		if(obj.getClass().getName() == "java.util.ArrayList") {
			ArrayList arry = (ArrayList) obj;
			if(arry.size()==0) {
				//System.out.println("ArrayList was empty");
				return false;
			}
		}
		if(obj.getClass().getName() == "java.util.HashMap") {
			HashMap map = (HashMap) obj;
			if(map.size()==0) {
				//System.out.println("HashMap was empty");
				return false;
			}
		}
		if(obj.getClass().getName() == "java.util.HashSet") {
			HashSet set = (HashSet) obj;
			if(set.size()==0) {
				//System.out.println("HashSet was empty");
				return false;
			}
		}

		//survived
		return true;
		
	}

	} //end class
