SUMMARY = "Client for devpi"
DESCRIPTION = "devpi-client is a command line tool with sub commands for creating users, using \
indexes, uploading to and installing from indexes, as well as a 'test' command \
for invoking tox."
LICENSE = "MIT"

PV = "6.0.4"

RPM_NAME = "python39-devpi-client-6.0.4-2.1.noarch.rpm"
RPM_HASH = "74f77b250c3668a0df595c76a3b1342128b3779d4aca263a13cd0b383aef44e7f7fe02e68d4de577995b17a5178e44d1fbcc73454334207bd119bf062c987ac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(devpi-client) \
python39-devpi-client \
python3dist(devpi-client)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-build \
python39-check-manifest \
python39-devpi-common \
python39-pkginfo \
python39-pluggy \
python39-py \
python39-tox \
python39-wheel \
update-alternatives"

inherit rpm
