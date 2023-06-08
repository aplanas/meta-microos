SUMMARY = "Microsoft Azure Service Management Legacy Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Management Legacy Client Library. \
 \
All packages in this bundle have been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "Apache-2.0"

PV = "0.20.7"

RPM_NAME = "python39-azure-servicemanagement-legacy-0.20.7-2.11.noarch.rpm"
RPM_HASH = "e41fde655572fe91da8fa229844d889a201730a5fbf5ae343b3463d866100d222970fc7a32dcd07776a77458292a73af6d6a59e8e6a53f433d6cba2fbdb8d46d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-servicemanagement-legacy) python39-azure-servicemanagement-legacy python3dist(azure-servicemanagement-legacy)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-nspkg python39-requests"

inherit rpm
