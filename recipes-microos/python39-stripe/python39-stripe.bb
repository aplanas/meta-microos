SUMMARY = "Python bindings for the Stripe API"
DESCRIPTION = "Python bindings for the Stripe API."
LICENSE = "MIT"

PV = "2.63.0"

RPM_NAME = "python39-stripe-2.63.0-1.8.noarch.rpm"
RPM_HASH = "e7156d91b907796a4affa87f14934b6dc94e1564fd9efce73cd544defb6853ef361499008e9d6f96698a25d9e7be085bc3160405bed12bbbb80048281025f7c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(stripe) \
python39-stripe \
python3dist(stripe)"
RDEPENDS:${PN} += "python(abi) \
python39-requests"

inherit rpm
