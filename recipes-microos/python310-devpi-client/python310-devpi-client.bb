SUMMARY = "Client for devpi"
DESCRIPTION = "devpi-client is a command line tool with sub commands for creating users, using \
indexes, uploading to and installing from indexes, as well as a 'test' command \
for invoking tox."
LICENSE = "MIT"

PV = "6.0.4"

RPM_NAME = "python310-devpi-client-6.0.4-2.1.noarch.rpm"
RPM_HASH = "a2e71b95b9f4aa35b1933b2b57459aadf7e96f809d81918976adfc9b00934379dd23b8c92382d5fab1b503f10d1328ea033cbea6bc4305919ecd5511b1468b39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-devpi-client python3.10dist(devpi-client) python310-devpi-client python3dist(devpi-client)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-build python310-check-manifest python310-devpi-common python310-pkginfo python310-pluggy python310-py python310-tox python310-wheel update-alternatives"

inherit rpm
