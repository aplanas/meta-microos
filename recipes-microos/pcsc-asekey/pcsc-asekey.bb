SUMMARY = "ASEKey USB Token Driver"
DESCRIPTION = "This package contains a driver for the ASEKey USB Token. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "BSD-3-Clause"

PV = "3.7"

RPM_NAME = "pcsc-asekey-3.7-4.10.aarch64.rpm"
RPM_HASH = "67b0866bee16af30da8a11cd5a0da7e7c0130a16a1c55a64aac4063b10af7e40b2e4d5a3dd93784f7c6ba58e05779d6f8850999aa146f1f1838325d6186d0ce9"

RPROVIDES:${PN} += "libASEKey.so()(64bit) \
pcsc-asekey \
pcsc-asekey(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libusb-0.1.so.4()(64bit) \
pcsc-lite"

inherit rpm
