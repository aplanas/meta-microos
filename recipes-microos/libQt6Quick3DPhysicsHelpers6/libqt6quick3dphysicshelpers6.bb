SUMMARY = "Qt 6 Quick3DPhysicsHelpers library"
DESCRIPTION = "The Qt 6 Quick3DPhysicsHelpers library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "libQt6Quick3DPhysicsHelpers6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "b10b72f5d62ca9e56d40743252937a29d6e4bb8bbeb448980d98148a93a099dbfa8f5965eaf7743842de9ce64a3b2df8b4437059bc8c8269c40a3070e1ef5ccc"

RPROVIDES:${PN} += "libQt6Quick3DPhysicsHelpers.so.6()(64bit) libQt6Quick3DPhysicsHelpers.so.6(Qt_6)(64bit) libQt6Quick3DPhysicsHelpers.so.6(Qt_6.0)(64bit) libQt6Quick3DPhysicsHelpers.so.6(Qt_6.1)(64bit) libQt6Quick3DPhysicsHelpers.so.6(Qt_6.2)(64bit) libQt6Quick3DPhysicsHelpers.so.6(Qt_6.3)(64bit) libQt6Quick3DPhysicsHelpers.so.6(Qt_6.4)(64bit) libQt6Quick3DPhysicsHelpers.so.6(Qt_6.5)(64bit) libQt6Quick3DPhysicsHelpers.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DPhysicsHelpers6 libQt6Quick3DPhysicsHelpers6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick3D.so.6()(64bit) libQt6Quick3D.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
