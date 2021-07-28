import variables.JSON_file as files
import json


def load_product_data():
    """Load data about searched product. Return product code and amount of this"""

    with open(files.PRODUCT_DATA_LOCALIZATION, 'r') as f:
        data = json.load(f)
        code, amount = data["code"], data["amount"]
        return [code, amount]
