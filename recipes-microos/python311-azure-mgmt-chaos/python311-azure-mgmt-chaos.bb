SUMMARY = "Microsoft Azure Chaos Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Chaos Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0b6"

RPM_NAME = "python311-azure-mgmt-chaos-1.0.0b6-1.3.noarch.rpm"
RPM_HASH = "ea48f4b0649d4ea2eb30f3a48efb7239ac8d29e381dbbc6aa9efce68a910b3daa6767611167a4932088ae8795bfc09d3437b9eb743252744d9c224bb8e0eb618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-chaos) python311-azure-mgmt-chaos python3dist(azure-mgmt-chaos)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
