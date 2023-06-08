SUMMARY = "Microsoft Azure Agrifood Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Agrifood Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b3"

RPM_NAME = "python39-azure-mgmt-agrifood-1.0.0b3-1.3.noarch.rpm"
RPM_HASH = "6a61df5414d1d3f11cc3b1e6758d06460cc00703994c2cf59b388f81fdeeea7ff217348efa3d726122840523905d871e4831f5b245348f2f32337714d02562c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-agrifood) python39-azure-mgmt-agrifood python3dist(azure-mgmt-agrifood)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
