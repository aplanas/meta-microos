SUMMARY = "Microsoft Azure App Configuration Management Client Library"
DESCRIPTION = "This is the Microsoft Azure App Configuration Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-azure-mgmt-appconfiguration-3.0.0-1.2.noarch.rpm"
RPM_HASH = "dc27b008a01186bfaab29c6d032b5a06200fa1aadb05034ca66ab5c1ec6a6cfa5ff6c2b07c4af291e31504db30c28f75e2da7a063de413679bbc8ed1fa6d0c5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-appconfiguration) \
python39-azure-mgmt-appconfiguration \
python3dist(azure-mgmt-appconfiguration)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
