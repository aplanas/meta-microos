SUMMARY = "Task management and system monitoring library -- devel files"
DESCRIPTION = "Task management and system monitoring library. This package contains development \
files."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "libksysguard5-devel-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "fb1c1186acb60e4cdef203d0299517f31687c016d051205be70bb786913b66517e06840a7c3d4d9a664d88497acb06ca91e9a5a20a6fcab05c68a1cd7d64a816"

RPROVIDES:${PN} += "cmake(KF5SysGuard) cmake(KSysGuard) libksysguard5-devel libksysguard5-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Config) cmake(KF5I18n) cmake(KF5IconThemes) cmake(Qt5Core) cmake(Qt5DBus) cmake(Qt5Network) cmake(Qt5Widgets) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKSysGuardSystemStats1 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libksignalplotter.so.9()(64bit) libksysguard5 liblsofui.so.9()(64bit) libprocessui.so.9()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
