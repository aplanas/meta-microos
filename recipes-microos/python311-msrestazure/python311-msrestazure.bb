SUMMARY = "AutoRest swagger generator - Azure-specific module"
DESCRIPTION = "AutoRest swagger generator Python client runtime. Azure-specific module."
LICENSE = "MIT"

PV = "0.6.4"

RPM_NAME = "python311-msrestazure-0.6.4-2.11.noarch.rpm"
RPM_HASH = "32a6e6fcd7fbbe460e19d1724e8ea18bfbe89b672cdee40b2869f51e9c8d4e67a48254b555c09da3070b25e04ac2e4664fab88ed2793138eb16b484bc325c574"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(msrestazure) \
python311-msrestazure \
python3dist(msrestazure)"
RDEPENDS:${PN} += "python(abi) \
python311-adal \
python311-msrest \
python311-six"

inherit rpm
