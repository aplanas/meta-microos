SUMMARY = "Microsoft Azure Reservations Client Library"
DESCRIPTION = "This is the Microsoft Azure Reservations Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python39-azure-mgmt-reservations-2.3.0-1.2.noarch.rpm"
RPM_HASH = "54615c6e1490eb3814f3af4c8208e2006421c2d2e8633905555b0ad5795d0d5d72c42d0c47201a08300149f5ca9c973a07e0303619b1cc4b945be0e7b6cd52b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-reservations) python39-azure-mgmt-reservations python3dist(azure-mgmt-reservations)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
