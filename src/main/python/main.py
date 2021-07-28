import features.load_products as load
import features.load_data as load_data
import features.load_product_data as load_product_data


def get_product():
    """Function which returns product description and price for it"""
    load.load()
    code, amount = load_product_data.load_product_data()
    data = load_data.load_product_data(code, amount)
    print(data[0])
    print(data[1])


if __name__ == '__main__':
    get_product()
