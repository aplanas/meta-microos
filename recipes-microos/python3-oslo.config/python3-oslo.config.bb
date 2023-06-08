SUMMARY = "OpenStack common configuration library"
DESCRIPTION = "The Oslo project intends to produce a python library containing \
infrastructure code shared by OpenStack projects. The APIs provided \
by the project should be high quality, stable, consistent and generally \
useful. \
 \
The oslo-config library is a command line and configuration file \
parsing library from the Oslo project. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "9.1.1"

RPM_NAME = "python3-oslo.config-9.1.1-1.1.noarch.rpm"
RPM_HASH = "d34a79ee434f04477525266eec7b2a8c4a85f95f7315075a70498508e132f732e1ed2c1043719485dda75b67886e3475dd07cbcc2376675e0b55029fc8171e8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.config python3.10dist(oslo.config) python3dist(oslo.config)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-PyYAML python3-debtcollector python3-importlib-metadata python3-netaddr python3-oslo.i18n python3-requests python3-rfc3986 python3-stevedore"

inherit rpm
