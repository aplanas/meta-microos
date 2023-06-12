SUMMARY = "An Astropy package for photometry"
DESCRIPTION = "Photutils is an affiliated package of Astropy to provide tools for detecting \
and performing photometry of astronomical sources."
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "python310-photutils-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "52cb5539ff3122227c637794ecd5f9bf3e2282bcc40af3a4606ad76903b56635f7b29ea4c22d8d81b355f3f302ffbef0f2dca01e75c6903c8ed2a307e8455ca1"

RPROVIDES:${PN} += "python3-photutils python3.10dist(photutils) python310-photutils python310-photutils(aarch-64) python3dist(photutils)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python310-astropy python310-numpy"

inherit rpm
