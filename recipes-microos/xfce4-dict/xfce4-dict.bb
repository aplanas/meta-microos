SUMMARY = "Xfce Dictionary Client Application"
DESCRIPTION = "xfce4-dict allows you to search different kinds of dictionary services for \
words or phrases and shows you the result. Currently you can query a Dict \
server (RFC 2229), any online dictionary service by opening a web browser or \
search for words using the aspell/ispell program."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.5"

RPM_NAME = "xfce4-dict-0.8.5-1.1.aarch64.rpm"
RPM_HASH = "b4e2c7e7e4b89bef7a15be0506a3f534d6ba5cde795ef06395aa2a8348bcb1713b179814cafd2b295bfef73eaf24ce06b29fa02cd5545b5f93a5a0ad386d6618"

RPROVIDES:${PN} += "application() application(xfce4-dict.desktop) xfce4-dict xfce4-dict(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpango-1.0.so.0()(64bit) libxfce4ui-2.so.0()(64bit) libxfce4util.so.7()(64bit) xdg-utils"

inherit rpm
