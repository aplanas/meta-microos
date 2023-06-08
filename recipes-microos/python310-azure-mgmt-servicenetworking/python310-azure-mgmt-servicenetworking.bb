SUMMARY = "Microsoft Azure Servicenetworking Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Servicenetworking Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python310-azure-mgmt-servicenetworking-1.0.0~b1-1.3.noarch.rpm"
RPM_HASH = "596d77d2ab6c3b28a45cc0b0fc4f94a4bbf310489661e7029235dd7dbaac347d27e4ba06449ceec2658f3cc080517b979b467a915a725a29f80697c0610a5a0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-servicenetworking python3.10dist(azure-mgmt-servicenetworking) python310-azure-mgmt-servicenetworking python3dist(azure-mgmt-servicenetworking)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
