SUMMARY = "Library and components for secure lock screen architecture"
DESCRIPTION = "Library and components for secure lock screen architecture."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "libKScreenLocker5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "637971308e3de91c6a2edf7df46574266646f7b7a3519a48ec1f3af97b0684b99596ffd17dae7fc3e44a5610170ceea20df4938df4323f782862ccf668682b7b"

RPROVIDES:${PN} += "libKScreenLocker.so.5()(64bit) libKScreenLocker5 libKScreenLocker5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigQml.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5GlobalAccel.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IdleTime.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5Package.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libXi.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libwayland-server.so.0()(64bit) libxcb-keysyms.so.1()(64bit) libxcb.so.1()(64bit)"

inherit rpm
