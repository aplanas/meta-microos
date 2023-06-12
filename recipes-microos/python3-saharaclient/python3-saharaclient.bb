SUMMARY = "Client library for OpenStack Sahara API"
DESCRIPTION = "Python client library for interacting with OpenStack Sahara API. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "python3-saharaclient-3.5.0-1.6.noarch.rpm"
RPM_HASH = "278d18475e055ceb60489906d12d3b34cd5ddf565ece82a6942462b544242570e1963caa5a91b3e98414d296a00d6fd14d28b96c485e354c7a77cb81df963701"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-saharaclient \
python3.10dist(python-saharaclient) \
python3dist(python-saharaclient)"
RDEPENDS:${PN} += "python(abi) \
python3-Babel \
python3-keystoneauth1 \
python3-openstackclient \
python3-osc-lib \
python3-oslo.i18n \
python3-oslo.log \
python3-oslo.serialization \
python3-oslo.utils \
python3-requests \
python3-six"

inherit rpm
