SUMMARY = "MATE dictionary"
DESCRIPTION = "This is the MATE dictionary as shipped with the MATE utilities. \
mate-dictionary is a program which can look up the definition of \
words"
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-dictionary-1.26.0-1.11.aarch64.rpm"
RPM_HASH = "3ab3a844f2013f241898985abce7514d047f9ce1843a62064d4285bb98626c981ae45932d3ae890723a389b4e07f5e066fa450a713ea0b9a2236fecfad02a85e"

RPROVIDES:${PN} += "application() application(mate-dictionary.desktop) mate-dictionary mate-dictionary(aarch-64) metainfo() metainfo(mate-dictionary.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libmate-panel-applet-4.so.1()(64bit) libmatedict.so.6()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit)"

inherit rpm
