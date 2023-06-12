SUMMARY = "Near Field Communication (NFC) utilities"
DESCRIPTION = "This package contains one utility for listing NFC devices and \
in-field tags or targets."
LICENSE = "GPL-3.0+"

PV = "0.3.2"

RPM_NAME = "nfcutils-0.3.2-5.28.aarch64.rpm"
RPM_HASH = "0225e6d9c98a2757386741aaa977485f5977c8dfe9021a0936d0fd8f90da6270798707ddc5b9d6412c2451f69292fc52c50901a2b3eeb8bbeb06da935ba7d795"

RPROVIDES:${PN} += "nfcutils \
nfcutils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libnfc.so.6()(64bit)"

inherit rpm
