SUMMARY = "The KDE Plasma Workspace Components"
DESCRIPTION = "This package contains the basic packages for a KDE Plasma 5 workspace."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4.1"

RPM_NAME = "plasma5-workspace-libs-5.27.4.1-2.2.aarch64.rpm"
RPM_HASH = "ce3a7be462ab4187bd41b42a976cc414bfe374c4bc73514e17ab40df339c4fa9b1f5d359443fe09b62f97ddeb3240b8dbdf80ff0d6190f86af5f14f6ebb07b35"

RPROVIDES:${PN} += "libcolorcorrect.so.5()(64bit) libkrdb.so()(64bit) libkworkspace5.so.5()(64bit) libnotificationmanager.so.1()(64bit) libplasma-geolocation-interface.so.5()(64bit) libtaskmanager.so.6()(64bit) libweather_ion.so.7()(64bit) plasma5-workspace-libs plasma5-workspace-libs(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig kio kservice ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Activities.so.5()(64bit) libKF5Activities5 libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5CoreAddons5 libKF5I18n.so.5()(64bit) libKF5I18n5 libKF5ItemModels.so.5()(64bit) libKF5KIOFileWidgets.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5Plasma.so.5()(64bit) libKF5Screen.so.8()(64bit) libKF5Service.so.5()(64bit) libKF5WaylandClient.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5WindowSystem5 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core5 libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5DBus5 libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui5 libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Widgets5 libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libQt5X11Extras5 libX11.so.6()(64bit) libXau.so.6()(64bit) libc.so.6(GLIBC_2.32)(64bit) libksysguard5 libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) plasma-framework"

inherit rpm
