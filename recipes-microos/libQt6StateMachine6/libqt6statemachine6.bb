SUMMARY = "Qt 6 StateMachine library"
DESCRIPTION = "The Qt 6 StateMachine library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6StateMachine6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "e5461437cec4ed937e11ffde7c31f99312b2ae10d17f5ec8eb11316b651efa59106079962d14e8be3bc3d4bb6211a6b1d195c792a00694e734b91ece5ee57292"

RPROVIDES:${PN} += "libQt6StateMachine.so.6()(64bit) libQt6StateMachine.so.6(Qt_6)(64bit) libQt6StateMachine.so.6(Qt_6.0)(64bit) libQt6StateMachine.so.6(Qt_6.1)(64bit) libQt6StateMachine.so.6(Qt_6.2)(64bit) libQt6StateMachine.so.6(Qt_6.3)(64bit) libQt6StateMachine.so.6(Qt_6.4)(64bit) libQt6StateMachine.so.6(Qt_6.5)(64bit) libQt6StateMachine.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6StateMachine6 libQt6StateMachine6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
