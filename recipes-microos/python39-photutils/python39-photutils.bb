SUMMARY = "An Astropy package for photometry"
DESCRIPTION = "Photutils is an affiliated package of Astropy to provide tools for detecting \
and performing photometry of astronomical sources."
LICENSE = "BSD-3-Clause"

PV = "1.7.0"

RPM_NAME = "python39-photutils-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "c449982b79e31a303f61727483f2c0987c5049fa6a1451e968ae315fe5b22b2a3e2b7ce0b7a135c9a2d3f1db3f4ff765ad8f29190030eb9e3f200dcb0c33116f"

RPROVIDES:${PN} += "python3.9dist(photutils) python39-photutils python39-photutils(aarch-64) python3dist(photutils)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python39 python39-astropy python39-numpy"

inherit rpm
