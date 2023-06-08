SUMMARY = "Power Management and Auto-suspend"
DESCRIPTION = "LXQt daemon for power management and auto-suspend"
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-powermanagement-1.3.0-1.2.aarch64.rpm"
RPM_HASH = "b4977969567562783b976115b064c90772aef36592cb6bf6d9faeca1608dd6db6cc893a443d18972c6c6a76a948d7c0cdd330bfe7db1447734ed0a86a87ee8fc"

RPROVIDES:${PN} += "application() application(lxqt-config-powermanagement.desktop) config(lxqt-powermanagement) lxqt-powermanagement lxqt-powermanagement(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5IdleTime.so.5()(64bit) libKF5Solid.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui5 libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xdg.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) liblxqt-globalkeys.so.1()(64bit) liblxqt.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) upower"

inherit rpm
