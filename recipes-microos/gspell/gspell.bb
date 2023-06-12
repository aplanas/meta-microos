SUMMARY = "A spell checker library for GTK+ applications"
DESCRIPTION = "gspell provides a flexible API to implement the spell checking in a GTK+ \
application."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.1"

RPM_NAME = "gspell-1.12.1-1.2.aarch64.rpm"
RPM_HASH = "23581d423194eefb9dc2500248e4591c8163e82fbf19e31143d1cee642f0bc33b49ffdc0992e51a426f59461e68a87554286c107abee97565ed8adf8eb803833"

RPROVIDES:${PN} += "gspell gspell(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo-gobject.so.2()(64bit) libcairo.so.2()(64bit) libenchant-2.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgspell-1.so.2()(64bit) libgtk-3.so.0()(64bit) libharfbuzz.so.0()(64bit) libicudata.so.73()(64bit) libicuuc.so.73()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libz.so.1()(64bit)"

inherit rpm
