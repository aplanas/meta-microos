SUMMARY = "Microsoft Azure Resourceconnector Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resourceconnector Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python39-azure-mgmt-resourceconnector-1.0.0b4-1.1.noarch.rpm"
RPM_HASH = "2239d1bb94181b7e92b71fc07f79676ce6ee6d37a038e56c29fd435d65c85022925c5719ecff1783765cebbe53721a82a800f6131114c791bce4b276ddd9ec28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-resourceconnector) python39-azure-mgmt-resourceconnector python3dist(azure-mgmt-resourceconnector)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-isodate"

inherit rpm
