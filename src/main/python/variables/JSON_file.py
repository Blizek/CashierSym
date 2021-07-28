import os


# project directory path
PATH = os.path.dirname(os.path.abspath(__file__))

# DB with products
FILE_LOCALIZATION = os.path.join(PATH[:-17], "JSON\\products.json")

# file where data about the searched product is
PRODUCT_DATA_LOCALIZATION = os.path.join(PATH[:-17], "JSON\\data.json")
