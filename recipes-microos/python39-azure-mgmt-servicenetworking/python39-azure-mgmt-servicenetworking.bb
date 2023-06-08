SUMMARY = "Microsoft Azure Servicenetworking Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Servicenetworking Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python39-azure-mgmt-servicenetworking-1.0.0~b1-1.3.noarch.rpm"
RPM_HASH = "cbb211c0803a466a9387af5c3f47df8e4dd68c3f471fbfb0d6c1bfe828752420a577ef9bfd49f51f889bf257ae1eee1ed14004d15de58996909c3beb5404d1ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-servicenetworking) python39-azure-mgmt-servicenetworking python3dist(azure-mgmt-servicenetworking)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
