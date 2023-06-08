SUMMARY = "Python API and CLI for OpenStack Freezer"
DESCRIPTION = "Client library for Freezer built on the Freezer API. It provides a Python API \
(the freezerclient module) and a command-line tool (freezer). \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "4.4.0"

RPM_NAME = "python3-freezerclient-4.4.0-1.5.noarch.rpm"
RPM_HASH = "7b434585cb83cce328be1e3a7a264f9b848243a2b4acd357be1606c13fb02ae0e74abe7bb23f8f9154606f6b43f5c301c1d8da41a0c7bfe960a1095dca7657da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-freezerclient python3.10dist(python-freezerclient) python3dist(python-freezerclient)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-cliff python3-keystoneauth1 python3-oslo.serialization python3-oslo.utils python3-pbr"

inherit rpm
