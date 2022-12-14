
# TrackIt

TrackIt is a budgeting application (API) that helps its users
to create budgets for different aspects on their financial life
and easily track their spending, by creating spending plan and easily
see how much they have spent in real time.

## DataBase Design

This is the models used in this application





## Installation

To have this application run in your system, you just need.

```bash
  Java 17+
  MKDIR trackit
  CD trackit
  CMD https://github.com/CodaGott/budget-application.git
  Run the/install the dependences in the pom.xml file
  update the application.properties to have your own database 
  and other credentials
```

## API Reference

#### API

```http

  POST /api/create-category
  DELETE /api/delete
  UPDATE api/update/{budget-id}
  GET /api/budgets
  GET /api/budget/{name}
```

#### Get item

```http
  POST /api/transaction/create
  GET /api/transaction/{name}
  GET /api/transactions
```

| Parameter  | Type     | Description                         |
| :--------  | :------- | :---------------------------------- |
| `budget-id`| `Long`  | **Required**. Id of budget to get    |
| `category` | `String`| **Required**. category of budgets to get  |


## Authors

- [@codagott](https://www.github.com/codagott)

