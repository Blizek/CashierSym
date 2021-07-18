import sys

import features.load_products as load
import features.load_data as load_data
# import products.list_of_products as products_list
# import products.list_of_ID as ID_list
#
#
# if __name__ == "__main__":
#     load.load()
#     if "000001" in ID_list.ID_list:
#         index_product = ID_list.ID_list.index("000001")
#         product = products_list.products_list[index_product]
#         amount = int(input("Type amount of product: "))
#         print(product.price * amount)
# TEST TEST TEST TEST TEST TEST


def get_product():
    load.load()
    data = load_data.load_product_data("000001", 1)
    #return data


if __name__ == '__main__':
    globals()[sys.argv[1]]()
    #should be 0 for successful exit
    #however just to demostrate that this value will reach Java in exit code
    sys.exit(220)
