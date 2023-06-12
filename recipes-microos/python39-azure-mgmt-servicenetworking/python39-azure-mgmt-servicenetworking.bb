SUMMARY = "Microsoft Azure Servicenetworking Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Servicenetworking Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python39-azure-mgmt-servicenetworking-1.0.0~b2-1.1.noarch.rpm"
RPM_HASH = "0caa42b1940e24f77c048aa161cb39fad80f5635856c4563c14f9d17c824969478502632aff15aa79354fc0c5a4478ee8f62a19a5430b060f1cf1bcac0c49c55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-servicenetworking) python39-azure-mgmt-servicenetworking python3dist(azure-mgmt-servicenetworking)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-isodate"

inherit rpm
