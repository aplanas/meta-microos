SUMMARY = "PyQt - devel part of python bindings for Qt 5"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications"
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python39-qt5-devel-5.15.9-1.6.aarch64.rpm"
RPM_HASH = "88b34169e9905ffac1307d1981fb8f7d42fb816a87d074931e23010ec19375a734f299667357f435372a94078cb481e10ce8f238eea3768c07fd659b70cabb27"

RPROVIDES:${PN} += "libpy3.9qt5.so()(64bit) \
python-qt5-common-devel \
python-qt5-utils \
python39-PyQt5-devel \
python39-qt5-devel \
python39-qt5-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libpython3.9.so.1.0()(64bit) \
libqt5-qtbase-devel \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
pkgconfig(Qt5Bluetooth) \
pkgconfig(Qt5Designer) \
pkgconfig(Qt5Help) \
pkgconfig(Qt5Location) \
pkgconfig(Qt5Multimedia) \
pkgconfig(Qt5MultimediaWidgets) \
pkgconfig(Qt5Nfc) \
pkgconfig(Qt5Positioning) \
pkgconfig(Qt5Qml) \
pkgconfig(Qt5Quick) \
pkgconfig(Qt5QuickWidgets) \
pkgconfig(Qt5SerialPort) \
pkgconfig(Qt5Svg) \
pkgconfig(Qt5TextToSpeech) \
pkgconfig(Qt5UiTools) \
pkgconfig(Qt5WebChannel) \
pkgconfig(Qt5WebSockets) \
pkgconfig(Qt5X11Extras) \
pkgconfig(Qt5XmlPatterns) \
python(abi) \
python39-dbus-python-devel \
python39-devel \
python39-qt5 \
update-alternatives"

inherit rpm
