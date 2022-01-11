import React from "react";
import UserServices from "../services/UserServices";


class UserComponent extends React.Component { /*create component here using es6 classes*/

    constructor(props) {
        super(props)
        this.state = {
            users: []
        }
    }
    componentDidMount() {/*we use this method to call our end points*/
        UserServices.getUsers().then((response) => {
            this.setState({ users: response.data });

        })
    }


    render() {  /*add a render method in the component since it returns jsx*/
        return (
            <div>
                {/*this component displays a list of users on the web page*/}
                <h1 className="text-center">Users List</h1>
                <table className="table table-striped">
                    <thead>
                        <tr>
                            <td>User Id</td>
                            <td>First Name</td>
                            <td>Last Name</td>
                            <td>EmailId</td>
                        </tr>

                    </thead>
                    <tbody>
                        {
                            this.state.users.map(
                                user =>
                                    <tr key={user.id}>
                                        <td>{user.id}</td>
                                        <td>{user.fName}</td>
                                        <td>{user.lName}</td>
                                        <td>{user.email}</td>

                                    </tr>
                            )
                        }

                    </tbody>
                </table>
            </div>
        )
    }

}
export default UserComponent