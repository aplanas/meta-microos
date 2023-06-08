SUMMARY = "An Astropy package for photometry"
DESCRIPTION = "Photutils is an affiliated package of Astropy to provide tools for detecting \
and performing photometry of astronomical sources."
LICENSE = "BSD-3-Clause"

PV = "1.7.0"

RPM_NAME = "python310-photutils-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "be5ed8dda522a77142c2320a628e274be4c57760ca61851017ce5f1c45452656a471c862db8d317f59ff9986fbd6aa8381d8737e3a4e101301ea6c971241d0ca"

RPROVIDES:${PN} += "python3-photutils python3.10dist(photutils) python310-photutils python310-photutils(aarch-64) python3dist(photutils)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python310 python310-astropy python310-numpy"

inherit rpm
