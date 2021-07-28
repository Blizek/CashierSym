class Product:
    """Model class to describe products in shop. It includes name/description of product, price per item,
    type of that product (it cost per item or per weight) and product ID/code"""

    name, type_of_product = "", ""
    price, ID = 0.0, 0

    def __init__(self, name, price, type_of_product, ID):
        self.name = name
        self.price = price
        self.type_of_product = type_of_product
        self.ID = ID
