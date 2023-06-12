SUMMARY = "Sudoku Game for GNOME"
DESCRIPTION = "Sudoku is a logic puzzle game, in which one must fill a 9 by 9 square \
with the correct digits."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-sudoku-44.0-1.1.aarch64.rpm"
RPM_HASH = "0f705bc65c70d36ddaf59e6132a2856a1c015a94ca871f35d609ac29b7eb0617c971b6a000420976e7f22a4a352072287593053d5980083e35057300b40ca154"

RPROVIDES:${PN} += "application() \
application(org.gnome.Sudoku.desktop) \
gnome-sudoku \
gnome-sudoku(aarch-64) \
metainfo() \
metainfo(org.gnome.Sudoku.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libqqwing.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit)"

inherit rpm
