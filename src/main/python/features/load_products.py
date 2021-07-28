import products.list_of_ID as ID_list
import products.list_of_products as products_list
import model.product as product_model
import variables.JSON_file
import json


def load():
    """Thanks to that function all products are in list ('list_of_products.products_list') (which is temporary DB) and
    their ID codes on the same index as products in another ('list_of_ID.ID_list')"""

    with open(variables.JSON_file.FILE_LOCALIZATION, 'r') as f:
        new_product = json.load(f)
        for product in new_product:
            products_list.products_list.append(product_model.Product(product["name"], product["price"], product["type"],
                                                                     product["code"]))
            ID_list.ID_list.append(product["code"])