SUMMARY = "Python module to convert voluptuous schemas to dictionaries"
DESCRIPTION = "A Python module to convert voluptuous schemas to dictionaries."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "python310-voluptuous-serialize-2.5.0-1.3.noarch.rpm"
RPM_HASH = "cd63d9bf1dad94c68d1380daa1cd69e4d8474ed327c4b9ddce63833287e5b1973743e43292b294950bb774972ee8981d8bb1f4d85d721a6e9b68df963902ca2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-voluptuous-serialize python3.10dist(voluptuous-serialize) python310-voluptuous-serialize python3dist(voluptuous-serialize)"
RDEPENDS:${PN} += "python(abi) python310-voluptuous"

inherit rpm
