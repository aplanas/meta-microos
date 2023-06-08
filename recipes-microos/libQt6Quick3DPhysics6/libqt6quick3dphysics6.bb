SUMMARY = "Qt 6 Quick3DPhysics library"
DESCRIPTION = "The Qt 6 Quick3DPhysics library."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "libQt6Quick3DPhysics6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "ae72f83886cd566d2d4fb393d6b69d5b777193de70aa3512761a71cc8c39b32c54d4630aa320743fca1e47b58d83858e6b3ee0fe3ab839098a8b85cd82ec2585"

RPROVIDES:${PN} += "libQt6Quick3DPhysics.so.6()(64bit) libQt6Quick3DPhysics.so.6(Qt_6)(64bit) libQt6Quick3DPhysics.so.6(Qt_6.0)(64bit) libQt6Quick3DPhysics.so.6(Qt_6.1)(64bit) libQt6Quick3DPhysics.so.6(Qt_6.2)(64bit) libQt6Quick3DPhysics.so.6(Qt_6.3)(64bit) libQt6Quick3DPhysics.so.6(Qt_6.4)(64bit) libQt6Quick3DPhysics.so.6(Qt_6.5)(64bit) libQt6Quick3DPhysics.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DPhysics6 libQt6Quick3DPhysics6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick3D.so.6()(64bit) libQt6Quick3D.so.6(Qt_6)(64bit) libQt6Quick3D.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DRuntimeRender.so.6()(64bit) libQt6Quick3DRuntimeRender.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DUtils.so.6()(64bit) libQt6Quick3DUtils.so.6(Qt_6)(64bit) libQt6Quick3DUtils.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
