
# TrackIt

TrackIt is a budgeting appliaction (API) that helps it's users
to create buddgets for different aspects on their financial life
and easily track their spending, by creating spending plan and easily
see how much they have spent in real time.



## Installation

To have this application run in your system, you just need.

```bash
  Java 17+
```

## API Reference

#### API

```http
  POST /api/create-budget
  POST /api/create-category
  DELETE /api/delete
  UPDATE api/update/{budget-id}
  GET /api/budgets
  GET /api/budget/{category}
```

#### Get item

```http
  GET /api/items/{id}
  GET /api/budget/{category}
```

| Parameter  | Type     | Description                         |
| :--------  | :------- | :---------------------------------- |
| `budget-id`| `Long`  | **Required**. Id of budget to get    |
| `category` | `String`| **Required**. category of budgets to get  |


## Authors

- [@codagott](https://www.github.com/codagott)

