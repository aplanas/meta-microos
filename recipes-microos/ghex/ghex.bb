SUMMARY = "GNOME Binary Editor"
DESCRIPTION = "GHex allows the user to load data from any file and to view and edit it \
in either hex or ASCII. It is a must for anyone playing games that use \
a non-ASCII format for saving."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "ghex-44.1-1.1.aarch64.rpm"
RPM_HASH = "815e5ed33304e8360e4eab871d174273382c7ad6dad5c955804c7829ef32b581ece0f79037a3340e056536a7c880338472a7eb9a37fc57731c6cda8f2def27fd"

RPROVIDES:${PN} += "application() application(org.gnome.GHex.desktop) ghex ghex(aarch-64) libhex-buffer-direct.so()(64bit) libhex-buffer-mmap.so()(64bit) metainfo() metainfo(org.gnome.GHex.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libadwaita-1.so.0()(64bit) libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-4.so.1()(64bit) libgtkhex-4.so.1()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit)"

inherit rpm
