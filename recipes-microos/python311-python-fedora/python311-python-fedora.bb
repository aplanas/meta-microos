SUMMARY = "Python modules for interacting with Fedora Services"
DESCRIPTION = "Python modules for interacting with Fedora Services."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "python311-python-fedora-1.1.1-1.4.noarch.rpm"
RPM_HASH = "e2e03de06bbf5b57f6a11c50d4de03a7941ed53a237d25881a276da062f2640fc4519b8d9a4e9108afd1cccc7c0fafa47902c2c94a16750e02c29af1897ded08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-fedora) \
python311-python-fedora \
python3dist(python-fedora)"
RDEPENDS:${PN} += "python(abi) \
python311-beautifulsoup4 \
python311-kitchen \
python311-lockfile \
python311-munch \
python311-openidc-client \
python311-requests \
python311-six"

inherit rpm
