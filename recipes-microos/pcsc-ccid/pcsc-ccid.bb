SUMMARY = "PCSC Driver for CCID Based Smart Card Readers and GemPC Twin Serial Reader"
DESCRIPTION = "This package contains a generic USB CCID (Chip/Smart Card Interface \
Devices) driver. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.2"

RPM_NAME = "pcsc-ccid-1.5.2-1.3.aarch64.rpm"
RPM_HASH = "732bfb19a7b897d18ba71c9053d20aec851cece26bbfa7ea3488c8e9b0d73e3adb602d7048d8e0dba6f22f2bfd6e7e4b055a0ae2d00609fdd6c6ab7455ca3410"

RPROVIDES:${PN} += "config(pcsc-ccid) libccid.so()(64bit) libccidtwin.so()(64bit) pcsc-ccid pcsc-ccid(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libusb-1.0.so.0()(64bit) pcsc-lite"

inherit rpm
