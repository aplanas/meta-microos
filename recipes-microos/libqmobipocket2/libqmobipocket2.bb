SUMMARY = "E-book plugin and library"
DESCRIPTION = "Mobipocket E-book plugin and library."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "libqmobipocket2-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "42ab37a8f0a7be4b3ead7a56cc5dcb1afe2a01b9d0963ac47c6fe4b642085fc32d94d5d5f2057b4163c073d82c127219d966d61ec6a9f6382dc5cc418e56f76a"

RPROVIDES:${PN} += "libqmobipocket.so.2()(64bit) libqmobipocket2 libqmobipocket2(aarch-64) mobipocket"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
