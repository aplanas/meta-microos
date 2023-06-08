SUMMARY = "Microsoft Azure Network Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Network Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "23.0.1"

RPM_NAME = "python311-azure-mgmt-network-23.0.1-1.1.noarch.rpm"
RPM_HASH = "c49743c6041bbcb31ec4b5afa42b3d5a25646fe1819f782f5c2fc53093589f6a8fe0ec9588d26b6e173ced1d4871406e244f30932b51ee2b475ff28beab259bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-network) python311-azure-mgmt-network python3dist(azure-mgmt-network)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-isodate"

inherit rpm
