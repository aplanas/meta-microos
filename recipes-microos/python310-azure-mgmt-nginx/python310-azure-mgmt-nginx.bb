SUMMARY = "Microsoft Azure Nginx Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Nginx Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python310-azure-mgmt-nginx-2.1.0-1.2.noarch.rpm"
RPM_HASH = "ed770ce1200b035628b26d730e91370212da0c0591c8c14d77103cc7df2c0ca3b6d672a7267584320e0c613a01cb7ed273c67cea0b43295843eafd555ddbf7a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-nginx python3.10dist(azure-mgmt-nginx) python310-azure-mgmt-nginx python3dist(azure-mgmt-nginx)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.0.1 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
