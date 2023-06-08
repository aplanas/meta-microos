SUMMARY = "Microsoft Azure Front Door Service Client Library"
DESCRIPTION = "This is the Microsoft Azure Front Door Service Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python39-azure-mgmt-frontdoor-1.0.1-1.6.noarch.rpm"
RPM_HASH = "2a516d6f8050b780080b4d5c6e3ec6835a77131d765156f9ab842899bd992faedd2777ad320cb3cbb39047358e4193e5b145cf2006aa742e607e6b92b577ab97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-frontdoor) python39-azure-mgmt-frontdoor python3dist(azure-mgmt-frontdoor)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
