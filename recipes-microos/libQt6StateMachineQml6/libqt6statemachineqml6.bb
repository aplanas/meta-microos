SUMMARY = "Qt 6 StateMachineQml library"
DESCRIPTION = "The Qt 6 StateMachineQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6StateMachineQml6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "b44df8280a2a51f5fc841a004396c8219a6e01ac6ce66fc9c03c6c4332ea93b98d0d7bf9c38a6bc70961f1b2098a554e2975c53e4044b44123cecd59b47291df"

RPROVIDES:${PN} += "libQt6StateMachineQml.so.6()(64bit) libQt6StateMachineQml.so.6(Qt_6)(64bit) libQt6StateMachineQml.so.6(Qt_6.0)(64bit) libQt6StateMachineQml.so.6(Qt_6.1)(64bit) libQt6StateMachineQml.so.6(Qt_6.2)(64bit) libQt6StateMachineQml.so.6(Qt_6.3)(64bit) libQt6StateMachineQml.so.6(Qt_6.4)(64bit) libQt6StateMachineQml.so.6(Qt_6.5)(64bit) libQt6StateMachineQml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6StateMachineQml6 libQt6StateMachineQml6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6StateMachine.so.6()(64bit) libQt6StateMachine.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
