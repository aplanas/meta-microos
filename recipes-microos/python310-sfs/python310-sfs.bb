SUMMARY = "Sound Field Synthesis toolbox for Python"
DESCRIPTION = "The Sound Field Synthesis Toolbox for Python gives you the \
possibility to create numercial simulations of sound field \
synthesis methods like wave field synthesis (WFS) or \
near-field compensated higher order Ambisonics (NFC-HOA)."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python310-sfs-0.5.0-2.9.noarch.rpm"
RPM_HASH = "3ea5025c9c6c393b86e9371585cd8ffc1ebec5c84b112cd2f82a601c5734eb6a2f9134f2786ed11286f2f0d42ce8abe6e4895a5487af9e27b00cc174fb8e0c7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sfs python3.10dist(sfs) python310-sfs python3dist(sfs)"
RDEPENDS:${PN} += "python(abi) python310-numpy python310-scipy"

inherit rpm
