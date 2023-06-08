SUMMARY = "Microsoft Azure Template Package Client Library for Python"
DESCRIPTION = "This template package matches necessary patterns that the development team has established to \
create a unified sdk functional from Python 2.7 onwards. The packages contained herein can be \
installed singly or as part of the azure namespace. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8"
LICENSE = "MIT"

PV = "0.1.0b2609285"

RPM_NAME = "python311-azure-template-0.1.0b2609285-1.2.noarch.rpm"
RPM_HASH = "d83fed9d656207547a2cde3e6e67679a200a20b5110c24c53996a0e9869cf0299e3fb4742b4604a79a9b1803ef38d4e30139b3e6ded95eedd74d2306e81602b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-template) python311-azure-template python3dist(azure-template)"
RDEPENDS:${PN} += "python(abi) python311-azure-core"

inherit rpm
