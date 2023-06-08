SUMMARY = "System keyring service access from Python"
DESCRIPTION = "The Python keyring lib provides a way to access the system keyring service \
from python. It can be used in any application that needs safe password storage."
LICENSE = "MIT"

PV = "23.13.1"

RPM_NAME = "python311-keyring-23.13.1-2.1.noarch.rpm"
RPM_HASH = "87a13052296bb064cb9ec2da941a78ecd28982a1fa75e055f1f14516d1ff4d6e891c1f5f939527db888ea404294d988c3ea6b8f59bd2c4a02736116c812da2fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(keyring) python311-keyring python3dist(keyring)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-SecretStorage python311-importlib-metadata python311-jaraco.classes python311-jeepney update-alternatives"

inherit rpm
