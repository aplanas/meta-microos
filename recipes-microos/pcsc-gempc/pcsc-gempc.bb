SUMMARY = "PCSC driver for the Gemplus GemPC 410/430 smartcard readers"
DESCRIPTION = "This package contains a driver for the GemPC 410 and GemPC 430 smart \
card readers produced by Gemplus. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "1.0.8"

RPM_NAME = "pcsc-gempc-1.0.8-1.16.aarch64.rpm"
RPM_HASH = "5cacd4362f09d95528d5c7319b1bec124ef2bc14c525ecdc058c9637e5a5824a8a2bec674c271fa4a6a52c9fe8363528d3230c7852d638db44f24fb6450b5552"

RPROVIDES:${PN} += "libGemPC410.so.1.0.8()(64bit) \
libGemPC430.so.1.0.8()(64bit) \
pcsc-gempc \
pcsc-gempc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libusb-0.1.so.4()(64bit) \
pcsc-lite"

inherit rpm
