SUMMARY = "Python package providing access to the Keycloak API"
DESCRIPTION = "Python package providing access to the Keycloak API"
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python39-python-keycloak-2.6.0-1.4.noarch.rpm"
RPM_HASH = "8c52189f47a95cee1c18dad41129a6f62bb92db0bf3c42bd85e8baeceb6003b8ebf73ae77cca5b8f4ae07b15c1afd2a33281644e866363d886360ff7adc7b388"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-keycloak) python39-python-keycloak python3dist(python-keycloak)"
RDEPENDS:${PN} += "python(abi) python39-python-jose python39-requests python39-setuptools"

inherit rpm
