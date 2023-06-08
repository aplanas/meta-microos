SUMMARY = "Sound Field Synthesis toolbox for Python"
DESCRIPTION = "The Sound Field Synthesis Toolbox for Python gives you the \
possibility to create numercial simulations of sound field \
synthesis methods like wave field synthesis (WFS) or \
near-field compensated higher order Ambisonics (NFC-HOA)."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python39-sfs-0.5.0-2.9.noarch.rpm"
RPM_HASH = "0e86769ec6d2f91c158b87ddfb2e5d1449a8be197789dc55569b2c078d8a0f480a95423f3a45bca327172dee140233d8c8b90dcab3d6066c3394a1d9fd94a8ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sfs) python39-sfs python3dist(sfs)"
RDEPENDS:${PN} += "python(abi) python39-numpy python39-scipy"

inherit rpm
