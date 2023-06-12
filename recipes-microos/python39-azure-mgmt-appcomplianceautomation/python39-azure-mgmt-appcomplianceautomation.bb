SUMMARY = "Microsoft Azure Appcomplianceautomation Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Appcomplianceautomation Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python39-azure-mgmt-appcomplianceautomation-1.0.0~b1-1.3.noarch.rpm"
RPM_HASH = "feb608411a408526479f3aa4bf6a667717d11e7f5226ff5f8a2cd3c6af2b82ac74ca6dc919d22aaa32818cc970e8ce97346ecc4266455483ab8380619da72478"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-appcomplianceautomation) \
python39-azure-mgmt-appcomplianceautomation \
python3dist(azure-mgmt-appcomplianceautomation)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
