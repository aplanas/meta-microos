SUMMARY = "Microsoft Azure Container Service Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Service Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "22.1.0"

RPM_NAME = "python39-azure-mgmt-containerservice-22.1.0-1.1.noarch.rpm"
RPM_HASH = "551ede2b81cc78ce46d233ee89f71bea706ab2ee48425e2e54b410481c7820258d4cca9a4bab8227483550ea02ea6aaa2405c006fec717cdf871714fec36542f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-containerservice) python39-azure-mgmt-containerservice python3dist(azure-mgmt-containerservice)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-isodate"

inherit rpm
