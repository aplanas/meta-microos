SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python39-azure-mgmt-azurestackhci-7.0.0-1.5.noarch.rpm"
RPM_HASH = "33e37592133fe9511705d010b215e5e3cf76a8ad1209bc883c891fab853c9bf554314df77e4ede87fbb6082184e07e04c4d2be2dc2edf3cad6688c96985bb2b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-azurestackhci) python39-azure-mgmt-azurestackhci python3dist(azure-mgmt-azurestackhci)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
