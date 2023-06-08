SUMMARY = "Qt 6 StateMachine library"
DESCRIPTION = "The Qt 6 StateMachine library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6StateMachine6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "7f0fc1aa2676fedc5e6086932c6a969ff1240e9d2ed485cd5318225c36b26dc2cfd2bb7fcb9a9bf7970ecd9d5b2e13e544b10a22a76a2aec23482d6e322143bb"

RPROVIDES:${PN} += "libQt6StateMachine.so.6()(64bit) libQt6StateMachine.so.6(Qt_6)(64bit) libQt6StateMachine.so.6(Qt_6.0)(64bit) libQt6StateMachine.so.6(Qt_6.1)(64bit) libQt6StateMachine.so.6(Qt_6.2)(64bit) libQt6StateMachine.so.6(Qt_6.3)(64bit) libQt6StateMachine.so.6(Qt_6.4)(64bit) libQt6StateMachine.so.6(Qt_6.5)(64bit) libQt6StateMachine.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6StateMachine6 libQt6StateMachine6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
