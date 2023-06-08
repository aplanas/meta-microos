SUMMARY = "PyQt - devel part of python bindings for Qt 6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications"
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "a439b611fdc54befdd19a4efc936b8eda5e74b53c574af8666c4678397a83ad867164eb52e95088671fb5fb4c971df899a3625bdc7342ccf13f479349f3d5a4b"

RPROVIDES:${PN} += "libpy3.9qt6.so()(64bit) python39-PyQt6-devel python39-PyQt6-devel(aarch-64) python39-qt6-devel"
RDEPENDS:${PN} += "/bin/sh cmake(Qt6Bluetooth) cmake(Qt6Designer) cmake(Qt6Help) cmake(Qt6Multimedia) cmake(Qt6MultimediaWidgets) cmake(Qt6Nfc) cmake(Qt6Positioning) cmake(Qt6Qml) cmake(Qt6Quick) cmake(Qt6Quick3D) cmake(Qt6Quick3DRuntimeRender) cmake(Qt6QuickWidgets) cmake(Qt6RemoteObjects) cmake(Qt6Sensors) cmake(Qt6SerialPort) cmake(Qt6Svg) cmake(Qt6WebChannel) cmake(Qt6WebSockets) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libpython3.9.so.1.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) python(abi) python39-PyQt6 python39-dbus-python-devel python39-devel qt6-base-devel qt6-macros update-alternatives"

inherit rpm
