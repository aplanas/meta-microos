SUMMARY = "Microsoft Azure Template Package Client Library for Python"
DESCRIPTION = "This template package matches necessary patterns that the development team has established to \
create a unified sdk functional from Python 2.7 onwards. The packages contained herein can be \
installed singly or as part of the azure namespace. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8"
LICENSE = "MIT"

PV = "0.1.0b2675288"

RPM_NAME = "python311-azure-template-0.1.0b2675288-1.1.noarch.rpm"
RPM_HASH = "5be26b77b3879b54065ba260ba11f8b14c3bf8446ed294d85a17e02a31495de495a0da4c7df4820bd79dbf13d4e78ef4e7a5d573b8ca81db31070a81a20d7bdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-template) python311-azure-template python3dist(azure-template)"
RDEPENDS:${PN} += "python(abi) python311-azure-core"

inherit rpm
