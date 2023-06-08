SUMMARY = "Python bindings for the Qt 3D framework"
DESCRIPTION = "PyQt6-3D is a set of Python bindings for The Qt Company’s Qt 3D framework. The \
bindings sit on top of PyQt6 and are implemented as six separate modules \
corresponding to the different libraries that make up the framework."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-3D-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "ef23ea049b657600e89a941de634f61109b04618dd6b530cfe46e345e46944ebef153d389cd9c4d45835181f795eb50a923f02bfa0933c90fbfd1aedf00a8b0a"

RPROVIDES:${PN} += "python3.9dist(pyqt6-3d) python39-PyQt6-3D python39-PyQt6-3D(aarch-64) python39-qt3d-qt6 python3dist(pyqt6-3d)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt63DAnimation.so.6()(64bit) libQt63DAnimation.so.6(Qt_6)(64bit) libQt63DCore.so.6()(64bit) libQt63DCore.so.6(Qt_6)(64bit) libQt63DExtras.so.6()(64bit) libQt63DExtras.so.6(Qt_6)(64bit) libQt63DInput.so.6()(64bit) libQt63DInput.so.6(Qt_6)(64bit) libQt63DLogic.so.6()(64bit) libQt63DLogic.so.6(Qt_6)(64bit) libQt63DRender.so.6()(64bit) libQt63DRender.so.6(Qt_6)(64bit) libQt63DRender.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) python(abi) python39-PyQt6"

inherit rpm
