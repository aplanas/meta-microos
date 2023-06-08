SUMMARY = "Python API and CLI for OpenStack Ironic"
DESCRIPTION = "OpenStack Bare Metal Provisioning API Client Library. \
 \
This is a client for the OpenStack Ironic API. It provides a Python API (the \
ironicclient module) and a command-line interface (ironic). \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "python3-ironicclient-5.1.0-1.2.noarch.rpm"
RPM_HASH = "1b38e1360f62f435ec07ccc881a5ccb27bf25f7db1afcd94f159e6668aed89c39db34a9ca7d4312fa12efe72b722039ecda9b3f955bd537d895619536506dc79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ironicclient python3.10dist(python-ironicclient) python3dist(python-ironicclient)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-PyYAML python3-appdirs python3-dogpile.cache python3-jsonschema python3-keystoneauth1 python3-openstackclient python3-osc-lib python3-oslo.i18n python3-oslo.serialization python3-oslo.utils python3-pbr python3-requests"

inherit rpm
