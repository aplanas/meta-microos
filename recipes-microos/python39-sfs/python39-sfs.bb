SUMMARY = "Sound Field Synthesis toolbox for Python"
DESCRIPTION = "The Sound Field Synthesis Toolbox for Python gives you the \
possibility to create numercial simulations of sound field \
synthesis methods like wave field synthesis (WFS) or \
near-field compensated higher order Ambisonics (NFC-HOA)."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python39-sfs-0.6.2-1.1.noarch.rpm"
RPM_HASH = "99cfafb94fa11a287c70a4a05aa0ee59b06f2ea17acf316cd613573e9158f19bbee281883ed857f18e48fceecda588ee7da2f9be93d5020463033e61de729c16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sfs) \
python39-sfs \
python3dist(sfs)"
RDEPENDS:${PN} += "python(abi) \
python39-numpy \
python39-scipy"

inherit rpm
