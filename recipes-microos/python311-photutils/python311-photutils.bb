SUMMARY = "An Astropy package for photometry"
DESCRIPTION = "Photutils is an affiliated package of Astropy to provide tools for detecting \
and performing photometry of astronomical sources."
LICENSE = "BSD-3-Clause"

PV = "1.7.0"

RPM_NAME = "python311-photutils-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "8b8be4437357087c7df5b616d1f5fd32cead89bca05c8ca453b59749200736102c9a6fe7e76697822a8c2ee6e73bc0150c201c9889436eecacc0326a4c0e88df"

RPROVIDES:${PN} += "python3.11dist(photutils) python311-photutils python311-photutils(aarch-64) python3dist(photutils)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python311 python311-astropy python311-numpy"

inherit rpm
