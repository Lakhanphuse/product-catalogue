# product-catalogue

# GET
http://localhost:8080/api/getProducts

# POST
http://localhost:8080/api/products
body:
{
    "productName":"Videocon d2h",
    "productType":"Television",
    "productCategory":"Home Appliances",
    "productPrice":25000
}


# PUT
http://localhost:8080/api/products/1
{
    "productName":"Airtel Xtrem",
    "productType":"Television",
    "productCategory":"Home Appliances",
    "productPrice":12000
}



#DELETE
http://localhost:8080/api/products/1
