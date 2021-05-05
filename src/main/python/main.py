class Basket:
    summarise = 0
    product_name, type = "", ""

    def __init__(self, L):
        self.L = L

    def add(self, product):
        self.L.append(product)

    def remove(self, product_ID):
        self.L.pop(product_ID)

    def add_to_sum(self, product):
        self.summarise += product.price
        return self.summarise

    def product_type(self, product):
        self.product_name = product.name
        return self.product_name

    def check_type(self, product):
        self.type = product.type_of_product
        return self.type




