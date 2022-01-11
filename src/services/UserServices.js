import axios from "axios";

//create a constant to save our rest api
const USERS_REST_API_URL = 'http://localhost:8080/api/users';

class UserServices {
    //create method called get users, and notices that the axios object gets the Url
    getUsers() {
        return axios.get(USERS_REST_API_URL); // we use get to access the rest end point
    }

}
//here we export object of this class
export default new UserServices();