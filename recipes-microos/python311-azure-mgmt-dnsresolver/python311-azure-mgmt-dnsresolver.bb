SUMMARY = "Microsoft Azure Dnsresolver Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dnsresolver Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-dnsresolver-1.0.0-1.3.noarch.rpm"
RPM_HASH = "cce6fefb626de7c13d256766bc42d0210b059afd95757812bbe4d0ab17fe38e62aa0476de7b81760b1b18a8e53ed3cfe333d498999553fc1950dd162bf2c5b3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-dnsresolver) \
python311-azure-mgmt-dnsresolver \
python3dist(azure-mgmt-dnsresolver)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
