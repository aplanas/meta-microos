SUMMARY = "Client library for OpenStack Identity API"
DESCRIPTION = "Client library for interacting with Openstack Identity API."
LICENSE = "Apache-2.0"

PV = "4.5.0"

RPM_NAME = "python3-keystoneclient-4.5.0-1.5.noarch.rpm"
RPM_HASH = "4a93ef065b004071dcf47cca59b5c8e746b881020b7cc304673bf1f7cb4814756dd75952efb2d44344598a29e5b6b31a55302088dd893492a5a60211389d356d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-keystoneclient python3.10dist(python-keystoneclient) python3dist(python-keystoneclient)"
RDEPENDS:${PN} += "python(abi) python3-debtcollector python3-keystoneauth1 python3-oslo.config python3-oslo.i18n python3-oslo.serialization python3-oslo.utils python3-requests python3-stevedore"

inherit rpm
