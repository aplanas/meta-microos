SUMMARY = "Microsoft Azure DigitalTwins Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Digitaltwins Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "6.4.0"

RPM_NAME = "python39-azure-mgmt-digitaltwins-6.4.0-1.2.noarch.rpm"
RPM_HASH = "18e1d7ed7e4dc78c2ab7870df0e0095136a877f8a865d04e77ce68d89003ae6a329d0d7af191173cad582c60fbb140676784a43367716cadcfc21eb865c34693"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-digitaltwins) \
python39-azure-mgmt-digitaltwins \
python3dist(azure-mgmt-digitaltwins)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
