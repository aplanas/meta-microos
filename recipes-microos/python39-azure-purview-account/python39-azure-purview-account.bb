SUMMARY = "Microsoft Azure Purview Account Client Library for Python"
DESCRIPTION = "Azure Purview Account is a fully managed cloud service"
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python39-azure-purview-account-1.0.0b1-1.8.noarch.rpm"
RPM_HASH = "34ec2aa5c7814ed2342235d1f63e11e29244fc1d2c92da112f1f7e66182243a5d9fbaffd2356e80456ccce23768a64e3169b3e75615f73450a7cd5a89eb9fc9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-purview-account) python39-azure-purview-account python3dist(azure-purview-account)"
RDEPENDS:${PN} += "python(abi) python39-azure-core python39-azure-nspkg python39-azure-purview-nspkg python39-msrest python39-six"

inherit rpm
