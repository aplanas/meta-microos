SUMMARY = "Python 3 interface for libapparmor functions"
DESCRIPTION = "This package provides the python interface to AppArmor. It is used for python \
applications interfacing with AppArmor."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.3"

RPM_NAME = "python3-apparmor-3.1.3-2.1.aarch64.rpm"
RPM_HASH = "ac37604765b4279db5a5a835e1160421caf33003050a2cae245d53e3e0ff4ac08160ba25bc4efe224fd1adb917c3beb69bb1678732e4dd278c4a1c20b17246bb"

RPROVIDES:${PN} += "python3-apparmor python3-apparmor(aarch-64) python3.10dist(apparmor) python3.10dist(libapparmor) python3dist(apparmor) python3dist(libapparmor)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libapparmor.so.1()(64bit) libapparmor.so.1(APPARMOR_1.0)(64bit) libapparmor.so.1(APPARMOR_1.1)(64bit) libapparmor.so.1(APPARMOR_2.10)(64bit) libapparmor.so.1(APPARMOR_2.11)(64bit) libapparmor.so.1(APPARMOR_2.9)(64bit) libapparmor.so.1(PRIVATE)(64bit) libapparmor1 libc.so.6(GLIBC_2.17)(64bit) libcrypt.so.1()(64bit) libm.so.6()(64bit) python(abi) python3"

inherit rpm
