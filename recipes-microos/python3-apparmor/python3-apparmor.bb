SUMMARY = "Python 3 interface for libapparmor functions"
DESCRIPTION = "This package provides the python interface to AppArmor. It is used for python \
applications interfacing with AppArmor."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.4"

RPM_NAME = "python3-apparmor-3.1.4-1.1.aarch64.rpm"
RPM_HASH = "75537a5da648d605afaf37aa9755cb36487298e22eea7f329f1726b117f380cb05dd2412964ea94f569225d83c48e95cf06fbe8ddc17d813465fb85011884136"

RPROVIDES:${PN} += "python3-apparmor python3-apparmor(aarch-64) python3.10dist(apparmor) python3.10dist(libapparmor) python3dist(apparmor) python3dist(libapparmor)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libapparmor.so.1()(64bit) libapparmor.so.1(APPARMOR_1.0)(64bit) libapparmor.so.1(APPARMOR_1.1)(64bit) libapparmor.so.1(APPARMOR_2.10)(64bit) libapparmor.so.1(APPARMOR_2.11)(64bit) libapparmor.so.1(APPARMOR_2.9)(64bit) libapparmor.so.1(PRIVATE)(64bit) libapparmor1 libc.so.6(GLIBC_2.17)(64bit) libcrypt.so.1()(64bit) libm.so.6()(64bit) python(abi) python3"

inherit rpm
