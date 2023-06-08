SUMMARY = "Graphical desktop application for updating Flipper Zero firmware"
DESCRIPTION = "Graphical desktop application for updating Flipper Zero firmware \
 \
* Update Flipper's firmware and supplemental data with a press of one button \
* Repair a broken firmware installation \
* Stream Flipper's display and control it remotely \
* Install firmware from a .dfu file \
* Backup and restore settings, progress and pairing data"
LICENSE = "GPL-3.0-or-later"

PV = "1.2.2+git7.1672595968.84566a5"

RPM_NAME = "qFlipper-1.2.2+git7.1672595968.84566a5-1.3.aarch64.rpm"
RPM_HASH = "bd469563e7bb3ec2c67f39b07abe375f88dfede5e29fae930960e2089c35c5fdc41f53d57fdcf7a6c692668e3e6de6e5fc96a28a677eac2f22e52d73d9f7856d"

RPROVIDES:${PN} += "application() application(qFlipper.desktop) qFlipper qFlipper(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libQt5SerialPort.so.5()(64bit) libQt5SerialPort.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libusb-1.0.so.0()(64bit) libz.so.1()(64bit) qFlipper-base qFlipper-libflipperproto"

inherit rpm
