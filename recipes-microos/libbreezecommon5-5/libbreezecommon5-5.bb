SUMMARY = "Library containing support code for the Breeze Qt5 style"
DESCRIPTION = "Library containing support code for the Breeze Qt5 style."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "libbreezecommon5-5-5.27.4-2.1.aarch64.rpm"
RPM_HASH = "0cfd67b11fa2b5cd79cad5686c766bca75cfbcefd5e3aac2e1f7d94caf31c94ad1bb54b538f8fa5ff690ed6d5e2e4447d468a5bcd0510c186162a8390f910161"

RPROVIDES:${PN} += "libbreezecommon5-5 libbreezecommon5-5(aarch-64) libbreezecommon5.so.5()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
