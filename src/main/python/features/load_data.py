import products.list_of_ID as ID_list
import products.list_of_products as products_list


def load_product_data(ID, value):
    if ID not in ID_list.ID_list:
        return ["There is no product with that value", -1]
    else:
        index_product = ID_list.ID_list.index(ID)
        product = products_list.products_list[index_product]
        name, price = product.name, product.price
        data_info = name + " " + str(value) + "*" + str(price)
        cost = str(round(price * value, 2))
        return [data_info, cost]
