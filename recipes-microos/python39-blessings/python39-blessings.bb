SUMMARY = "A thin, practical wrapper around terminal capabilities in Python"
DESCRIPTION = "Curses-like terminal wrapper with a display based on compositing 2d \
arrays of text."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "python39-blessings-1.7-3.1.noarch.rpm"
RPM_HASH = "c7c31623c3e4d63363281823f40ab63489f2997ba959641d2ab69faef8b5a6e95c60a782b1453bca71bf4a9ad738d5839f1360de8ce09b2f4b27f8d1ceaebe25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(blessings) \
python39-blessings \
python3dist(blessings)"
RDEPENDS:${PN} += "python(abi) \
python39-curses \
python39-six"

inherit rpm
