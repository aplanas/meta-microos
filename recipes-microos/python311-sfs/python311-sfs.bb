SUMMARY = "Sound Field Synthesis toolbox for Python"
DESCRIPTION = "The Sound Field Synthesis Toolbox for Python gives you the \
possibility to create numercial simulations of sound field \
synthesis methods like wave field synthesis (WFS) or \
near-field compensated higher order Ambisonics (NFC-HOA)."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python311-sfs-0.5.0-2.9.noarch.rpm"
RPM_HASH = "6deb070cae8e7e8de9575628c77fa68fa078e797ea4e3b9dd0465521aacd8717ac21c24c56afefb13a072b60e25402829c14fd19fd88e53a369801ec7e84ec66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sfs) python311-sfs python3dist(sfs)"
RDEPENDS:${PN} += "python(abi) python311-numpy python311-scipy"

inherit rpm
