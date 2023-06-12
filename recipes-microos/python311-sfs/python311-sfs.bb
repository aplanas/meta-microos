SUMMARY = "Sound Field Synthesis toolbox for Python"
DESCRIPTION = "The Sound Field Synthesis Toolbox for Python gives you the \
possibility to create numercial simulations of sound field \
synthesis methods like wave field synthesis (WFS) or \
near-field compensated higher order Ambisonics (NFC-HOA)."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python311-sfs-0.6.2-1.1.noarch.rpm"
RPM_HASH = "642e2011752fb8aa7ab2035838f686c7e97e440e1e468cb11a6e7a35e04bbb4027d854d0d49907bf799a836517ef3cbc764fc6fe8c192b939bab7c62b70d3a2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sfs) python311-sfs python3dist(sfs)"
RDEPENDS:${PN} += "python(abi) python311-numpy python311-scipy"

inherit rpm
