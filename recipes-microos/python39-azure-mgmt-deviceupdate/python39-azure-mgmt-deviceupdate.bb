SUMMARY = "Microsoft Azure Deviceupdate Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Deviceupdate Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-deviceupdate-1.0.0.0-1.3.noarch.rpm"
RPM_HASH = "c337e5d920a5d67388102b4eb5a597c41b4832b9ac8fd5ec0bd6240e24fdc8a8aeb8313fa24aa5f181e09dddfa915291b74c82cf7381baf16a547dcbe5108f58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-deviceupdate) python39-azure-mgmt-deviceupdate python3dist(azure-mgmt-deviceupdate)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
