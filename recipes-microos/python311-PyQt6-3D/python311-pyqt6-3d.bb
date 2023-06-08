SUMMARY = "Python bindings for the Qt 3D framework"
DESCRIPTION = "PyQt6-3D is a set of Python bindings for The Qt Company’s Qt 3D framework. The \
bindings sit on top of PyQt6 and are implemented as six separate modules \
corresponding to the different libraries that make up the framework."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-3D-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "501cbae9d7742018d413f7b91782ab5f45f1a0ec9bd65710a98d0a3e9da1258f9a1619d8ae8419a9cbac3a834c942498dd4f3920350edd366627decf24fab971"

RPROVIDES:${PN} += "python3.11dist(pyqt6-3d) python311-PyQt6-3D python311-PyQt6-3D(aarch-64) python311-qt3d-qt6 python3dist(pyqt6-3d)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt63DAnimation.so.6()(64bit) libQt63DAnimation.so.6(Qt_6)(64bit) libQt63DCore.so.6()(64bit) libQt63DCore.so.6(Qt_6)(64bit) libQt63DExtras.so.6()(64bit) libQt63DExtras.so.6(Qt_6)(64bit) libQt63DInput.so.6()(64bit) libQt63DInput.so.6(Qt_6)(64bit) libQt63DLogic.so.6()(64bit) libQt63DLogic.so.6(Qt_6)(64bit) libQt63DRender.so.6()(64bit) libQt63DRender.so.6(Qt_6)(64bit) libQt63DRender.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) python(abi) python311-PyQt6"

inherit rpm
