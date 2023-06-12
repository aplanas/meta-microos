SUMMARY = "Commandline application for updating Flipper Zero firmware"
DESCRIPTION = "Commandline application for updating Flipper Zero firmware \
 \
* Update Flipper's firmware and supplemental data with a press of one button \
* Repair a broken firmware installation \
* Stream Flipper's display and control it remotely \
* Install firmware from a .dfu file \
* Backup and restore settings, progress and pairing data"
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1~rc1+git1.1684488882.0199220"

RPM_NAME = "qFlipper-cli-1.3.1~rc1+git1.1684488882.0199220-1.1.aarch64.rpm"
RPM_HASH = "ad239828b69671a7d3a919f44f9925fa77f2dde558509ba987dec794563f25575ef4b1e5bae6e52cf5e2c502c2185edcbb61de19b2d6c036e949abdcea6d3d7f"

RPROVIDES:${PN} += "qFlipper-cli qFlipper-cli(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5SerialPort.so.5()(64bit) libQt5SerialPort.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libusb-1.0.so.0()(64bit) libz.so.1()(64bit) qFlipper-base qFlipper-libflipperproto"

inherit rpm
