SUMMARY = "Qt 6 Quick3D library"
DESCRIPTION = "The Qt 6 Quick3D library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6Quick3D6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "263ce25c8f711cb1c387a2a20dcb526bbbd86fc52f1da699092f3a84b5e81e9873171042dffa58fadbc4c32cc3897a43c58c88cc507078ace6b9eef0a7987ffe"

RPROVIDES:${PN} += "libQt6Quick3D.so.6()(64bit) libQt6Quick3D.so.6(Qt_6)(64bit) libQt6Quick3D.so.6(Qt_6.0)(64bit) libQt6Quick3D.so.6(Qt_6.1)(64bit) libQt6Quick3D.so.6(Qt_6.2)(64bit) libQt6Quick3D.so.6(Qt_6.3)(64bit) libQt6Quick3D.so.6(Qt_6.4)(64bit) libQt6Quick3D.so.6(Qt_6.5)(64bit) libQt6Quick3D.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3D6 libQt6Quick3D6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QmlModels.so.6()(64bit) libQt6QmlModels.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Quick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DRuntimeRender.so.6()(64bit) libQt6Quick3DRuntimeRender.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DUtils.so.6()(64bit) libQt6Quick3DUtils.so.6(Qt_6)(64bit) libQt6Quick3DUtils.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.35)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
