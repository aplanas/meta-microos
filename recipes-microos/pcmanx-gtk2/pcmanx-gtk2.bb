SUMMARY = "User-friendly telnet client designed for BBS browsing"
DESCRIPTION = "An easy-to-use telnet client mainly targets BBS users. \
PCManX is a newly developed GPL'd version of PCMan, a full-featured famous BBS \
client formerly designed for MS Windows only. It aimed to be an easy-to-use yet \
full-featured telnet client facilitating BBS browsing with the ability to \
process double-byte characters."
LICENSE = "GPL-2.0+"

PV = "1.3"

RPM_NAME = "pcmanx-gtk2-1.3-1.30.aarch64.rpm"
RPM_HASH = "9916f7aaa23078fdfe213c4568a428a56b877350dcbb74b75797de62da4e863ac53372b08fff6f53f33e14e4cd5340af98ae1822834e15792482a4655be97efe"

RPROVIDES:${PN} += "application() \
application(pcmanx.desktop) \
pcmanx-gtk2 \
pcmanx-gtk2(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
desktop-file-utils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXft.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libltdl.so.7()(64bit) \
libnotify.so.4()(64bit) \
libpango-1.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
