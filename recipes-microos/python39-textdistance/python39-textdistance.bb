SUMMARY = "Compute distance between the two texts"
DESCRIPTION = "Compute distance between sequences. 30+ algorithms, pure python \
implementation, common interface, optional external libs usage."
LICENSE = "MIT"

PV = "4.5.0"

RPM_NAME = "python39-textdistance-4.5.0-1.3.noarch.rpm"
RPM_HASH = "dc3a160939f9abe55f2e1df9abde3fa0a6fb019bb076996641a7e086bb73a173a1d6e89459451342f66f333f14834787c1b641a90e7b152220c92d9329500569"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(textdistance) \
python39-textdistance \
python3dist(textdistance)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
