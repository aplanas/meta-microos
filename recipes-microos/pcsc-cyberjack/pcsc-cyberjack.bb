SUMMARY = "PC/SC IFD Handler for the Reiner SCT Cyberjack USB-SmartCard Readers"
DESCRIPTION = "This package includes the PC/SC IFD handler for the Reiner SCT \
Cyberjack pinpad/e-com/RFID USB chipcard readers. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.99.5final.SP15"

RPM_NAME = "pcsc-cyberjack-3.99.5final.SP15-1.4.aarch64.rpm"
RPM_HASH = "9c46fe3ce98f33de1c449220c701873a2c4f60265d9640bce555871cac3411c3ca036c8a92fe3f982c80c4984a222aaa381592d14060086c3d51e266a84b7157"

RPROVIDES:${PN} += "config(pcsc-cyberjack) libifd-cyberjack.so.6()(64bit) pcsc-cyberjack pcsc-cyberjack(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libusb-1.0.so.0()(64bit) pcsc-lite"

inherit rpm
