SUMMARY = "Microsoft Azure Desktop Virtualization Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Desktop Virtualization Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-desktopvirtualization-1.0.0-1.2.noarch.rpm"
RPM_HASH = "2653e8910af0a364d49f17a4e602fc2d60760b6c20c85a9d081f31f8cdd75cf0a6d2c895b35f4703e67198699011b2ba7fd35c0e975f3368bb9398a6b58a30d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-desktopvirtualization) python39-azure-mgmt-desktopvirtualization python3dist(azure-mgmt-desktopvirtualization)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
