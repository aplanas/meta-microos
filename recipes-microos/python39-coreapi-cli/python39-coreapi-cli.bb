SUMMARY = "An interactive command line client for Core API"
DESCRIPTION = "An interactive command line client for Core API."
LICENSE = "BSD-2-Clause"

PV = "1.0.9"

RPM_NAME = "python39-coreapi-cli-1.0.9-1.22.noarch.rpm"
RPM_HASH = "a9810db45894f082de0c7ae940078ad2100a8f611b32f1cf6d046ab83d213a3cc7666ef3898625407694bcdbe54ef6ff98a7b7b63227b1182da3c71d24e3d618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(coreapi-cli) python39-coreapi-cli python3dist(coreapi-cli)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-click python39-coreapi python39-coreschema python39-itypes python39-requests python39-uritemplate update-alternatives"

inherit rpm
