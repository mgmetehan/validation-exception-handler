# validation-exception-handler

### User Creation API

This API allows for the creation of users within a system. The endpoint expects a JSON payload with specific user details and will return validation errors if the provided data does not meet the required criteria.

#### Endpoint

```
POST http://localhost:8080/api/v1/users
```

#### Request

**Headers:**

```
Content-Type: application/json
```

**Body:**

```json
{
    "name": "",
    "surname": "",
    "userNumber": 0,
    "companyName": "",
    "email": "",
    "age": 0,
    "phoneNumber": ""
}
```

#### Validation Errors

If the provided data does not meet the validation requirements, the API will respond with a `400 Bad Request` status code and a detailed error message. Below is an example of the error response:

```json
{
    "errorDetails": [
        "surname: Surname must be between 3 and 10 characters",
        "name: Name must be between 3 and 10 characters",
        "companyName: Company name cannot be blank",
        "age: Age must be greater than or equal to 18",
        "userNumber: User number must be positive",
        "phoneNumber: Phone number must be 12 digits"
    ],
    "message": "Validation failed",
    "statusCode": 400,
    "statusMessage": "Bad Request"
}
```

#### Error Details

- **surname**: Must be between 3 and 10 characters.
- **name**: Must be between 3 and 10 characters.
- **companyName**: Cannot be blank.
- **age**: Must be greater than or equal to 18.
- **userNumber**: Must be a positive integer.
- **phoneNumber**: Must be exactly 12 digits.

Ensure that your request body adheres to these validation rules to avoid errors and successfully create a user.
