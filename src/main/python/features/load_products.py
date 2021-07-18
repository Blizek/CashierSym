import products.list_of_ID as ID_list
import products.list_of_products as products_list
import model.product as product_model
import variables.JSON_file
import json


def load():
    with open(variables.JSON_file.FILE_LOCALIZATION, 'r') as f:
        new_product = json.load(f)
        for product in new_product:
            products_list.products_list.append(product_model.Product(product["name"], product["price"], product["type"], product["code"]))
            ID_list.ID_list.append(product["code"])

