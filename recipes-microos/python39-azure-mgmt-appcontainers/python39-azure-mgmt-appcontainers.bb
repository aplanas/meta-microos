SUMMARY = "Microsoft Azure Appcontainers Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Appcontainers Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-mgmt-appcontainers-2.0.0-1.2.noarch.rpm"
RPM_HASH = "a111299ade06e9f5a76cda055ead6c527e84658674026db3352fe94a59ebaafd5aec9e99b0f4c6dc9c5f6f087dea6ca2176aff2447d57ac843eb246e0d1b44ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-appcontainers) \
python39-azure-mgmt-appcontainers \
python3dist(azure-mgmt-appcontainers)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
