SUMMARY = "Microsoft Azure Container Service Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Service Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "22.1.0"

RPM_NAME = "python310-azure-mgmt-containerservice-22.1.0-1.1.noarch.rpm"
RPM_HASH = "e0a6d96227c4221c67fdb76ab718dcf0b7c85bc8a663f442d6775beb30559c3d98052a26a8443ead4035c72730778f20b756d94f89d00a5a712046a7a8d09eb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-containerservice python3.10dist(azure-mgmt-containerservice) python310-azure-mgmt-containerservice python3dist(azure-mgmt-containerservice)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-isodate"

inherit rpm
