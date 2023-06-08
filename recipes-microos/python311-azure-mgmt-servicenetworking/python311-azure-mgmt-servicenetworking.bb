SUMMARY = "Microsoft Azure Servicenetworking Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Servicenetworking Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python311-azure-mgmt-servicenetworking-1.0.0~b1-1.3.noarch.rpm"
RPM_HASH = "10472bd87c369ec5414427307c0cc6938281abcaea4648af977116a1321e6bee984116cea10900f2ae68c0f0a482ce759e8b7c7b010c10f17b559cbea1f8cfc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-servicenetworking) python311-azure-mgmt-servicenetworking python3dist(azure-mgmt-servicenetworking)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
