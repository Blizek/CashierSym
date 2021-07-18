class Product:

    name, type_of_product = "", ""
    price, ID = 0, 0

    def __init__(self, name, price, type_of_product, ID):
        self.name = name
        self.price = price
        self.type_of_product = type_of_product
        self.ID = ID
