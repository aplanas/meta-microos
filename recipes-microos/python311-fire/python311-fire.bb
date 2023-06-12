SUMMARY = "A library for automatically generating command line interfaces"
DESCRIPTION = "Python Fire is a library for automatically generating command line \
interfaces (CLIs) from a Python object."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "python311-fire-0.5.0-1.3.noarch.rpm"
RPM_HASH = "954b52c81342fb197df3140eb430f055248131c9802b3eb1f939610688c1530980e4e67c138307b4ebb8a10b3593bd19bddc23b9f9bf617818c40b6ac6a13a7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(fire) \
python311-fire \
python3dist(fire)"
RDEPENDS:${PN} += "python(abi) \
python311-six \
python311-termcolor"

inherit rpm
