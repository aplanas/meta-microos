SUMMARY = "Libyui - GUI abstraction library"
DESCRIPTION = "This is the user interface engine that provides the abstraction from \
graphical user interfaces (Qt, Gtk) and text based user interfaces \
(ncurses). \
 \
Originally developed for YaST, it can also be used independently of \
YaST for generic (C++) applications. This package has very few \
dependencies."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "libyui16-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "da1c986813a38f47a6d86ad98e60e5d19f8506d36b3adead7326fdd85a2b44cbef951fc8b53d2416805372434ca16a50d6062da8bf199ff19e57a9215b01415b"

RPROVIDES:${PN} += "libyui-doc \
libyui.so.16()(64bit) \
libyui16 \
libyui16(aarch-64) \
yast2-libyui"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
yui_backend"

inherit rpm
