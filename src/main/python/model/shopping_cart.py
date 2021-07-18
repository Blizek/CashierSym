class Shopping_Cart:
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
        # return self.summarise




