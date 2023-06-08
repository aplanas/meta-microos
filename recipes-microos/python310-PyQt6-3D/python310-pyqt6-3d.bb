SUMMARY = "Python bindings for the Qt 3D framework"
DESCRIPTION = "PyQt6-3D is a set of Python bindings for The Qt Company’s Qt 3D framework. The \
bindings sit on top of PyQt6 and are implemented as six separate modules \
corresponding to the different libraries that make up the framework."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-3D-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "c53275be9791809737c2986b97991207956ce09fe6292c07335bfc421123a8d7a079be46f53bfb5bb22156b796726d798f6632b521be4636ccab0139fb165fd4"

RPROVIDES:${PN} += "python3-PyQt6-3D python3-qt3d-qt6 python3.10dist(pyqt6-3d) python310-PyQt6-3D python310-PyQt6-3D(aarch-64) python310-qt3d-qt6 python3dist(pyqt6-3d)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt63DAnimation.so.6()(64bit) libQt63DAnimation.so.6(Qt_6)(64bit) libQt63DCore.so.6()(64bit) libQt63DCore.so.6(Qt_6)(64bit) libQt63DExtras.so.6()(64bit) libQt63DExtras.so.6(Qt_6)(64bit) libQt63DInput.so.6()(64bit) libQt63DInput.so.6(Qt_6)(64bit) libQt63DLogic.so.6()(64bit) libQt63DLogic.so.6(Qt_6)(64bit) libQt63DRender.so.6()(64bit) libQt63DRender.so.6(Qt_6)(64bit) libQt63DRender.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) python(abi) python310-PyQt6"

inherit rpm
