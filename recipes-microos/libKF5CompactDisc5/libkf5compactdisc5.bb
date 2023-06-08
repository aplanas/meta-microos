SUMMARY = "CD drive library for KDE Platform"
DESCRIPTION = "The KDE Compact Disc library provides an API for applications using \
the KDE Platform to interface with the CD drives for audio CDs."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "libKF5CompactDisc5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "ea9d05f4e485dd96d000da4eb77dfb00ebd2afdc45f1f26506aaf2d02e9825400b64e65fc50b3f60d3778e30330567217390775c7c0249812903f25aff3adec7"

RPROVIDES:${PN} += "libKF5CompactDisc.so.5()(64bit) libKF5CompactDisc5 libKF5CompactDisc5(aarch-64) libkcompactdisc"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5I18n.so.5()(64bit) libKF5Solid.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.34)(64bit) libphonon4qt5.so.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
