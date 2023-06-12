SUMMARY = "PLplot functions for scientific plotting with python-qt4"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the PLplot functions required for scientific \
plotting with python-qt."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-python3-qt-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "fe32f0f4e845a5541677af12e3b05dd1adb441ee777974e2e8caecf07b3d758edb11890dcfa9ee72e63bf8ce07cf39fcb271774fb68d574046565f0d24360cde"

RPROVIDES:${PN} += "plplot-python3-qt \
plplot-python3-qt(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libplplotqt.so.2()(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
plplot-common \
python(abi) \
python3-qt5"

inherit rpm
