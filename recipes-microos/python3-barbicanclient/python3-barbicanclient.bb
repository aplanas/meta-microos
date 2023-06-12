SUMMARY = "Client for the Barbican Key Management API"
DESCRIPTION = "This is a client for the Barbican Key Management API. This package includes a \
Python library for accessing the API (the barbicanclient module), and a \
command-line script (barbican). \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "5.2.0"

RPM_NAME = "python3-barbicanclient-5.2.0-1.4.noarch.rpm"
RPM_HASH = "6269b57a6e9a6cda70d80aadf628cf0fca921e987945e335e8c46b7582412615657bd4dcb4cfe421ef9afe009ba777ef24fd7b5e581aa16a40e59d6e115108d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-barbicanclient \
python3.10dist(python-barbicanclient) \
python3dist(python-barbicanclient)"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-cliff \
python3-keystoneauth1 \
python3-oslo.i18n \
python3-oslo.serialization \
python3-oslo.utils \
python3-pbr \
python3-requests \
python3-six"

inherit rpm
