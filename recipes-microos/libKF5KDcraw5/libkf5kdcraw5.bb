SUMMARY = "Shared library interface around dcraw"
DESCRIPTION = "Libkdcraw is a C++ interface around dcraw binary program used to decode \
RAW picture files.  The library documentation is available on header \
files. \
 \
This library is used by kipi-plugins, digiKam and others kipi host \
programs."
LICENSE = "LGPL-2.0-or-later & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.04.0"

RPM_NAME = "libKF5KDcraw5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "0ced7bcb118d02e3f6401b088fa5b4a6815c618a0d9004c1cceea4b3da44231a37e6e11b0ecc03a0d43d50db1cc4e8016e5c7f358d79aec1452a953c9443a647"

RPROVIDES:${PN} += "libKF5KDcraw.so.5()(64bit) libKF5KDcraw5 libKF5KDcraw5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libraw.so.23()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
