SUMMARY = "Task management and system monitoring library -- devel files"
DESCRIPTION = "Task management and system monitoring library. This package contains development \
files."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "libksysguard5-devel-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "47b7b3df74e350e1e878d6e06ae2df8c3e89c7af0e6deac9eb21cb588112c30dfe861f18000fbc52ab82e49b94b112a4c6d5f557ba57761f6f6abc11f4a0e811"

RPROVIDES:${PN} += "cmake(KF5SysGuard) cmake(KSysGuard) libksysguard5-devel libksysguard5-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Config) cmake(KF5I18n) cmake(KF5IconThemes) cmake(Qt5Core) cmake(Qt5DBus) cmake(Qt5Network) cmake(Qt5Widgets) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKSysGuardSystemStats1 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libksignalplotter.so.9()(64bit) libksysguard5 liblsofui.so.9()(64bit) libprocessui.so.9()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
