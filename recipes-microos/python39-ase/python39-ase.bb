SUMMARY = "Atomic Simulation Environment"
DESCRIPTION = "Atomic Simulation Environment"
LICENSE = "LGPL-2.1-or-later"

PV = "3.22.1"

RPM_NAME = "python39-ase-3.22.1-2.2.noarch.rpm"
RPM_HASH = "af7a852c7e56c0f2cc9b8445c1245977c29b3bbe917e8f9ef918dd0c2b3ced09613e45b5624980297b660bbb9f474c54afa85ebd67627baa852bdc906ee8027f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ase) \
python39-ase \
python3dist(ase)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-matplotlib \
python39-numpy \
python39-scipy"

inherit rpm
