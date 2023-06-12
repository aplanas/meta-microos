SUMMARY = "Parental Control Application"
DESCRIPTION = "Parental Control management application for Malcontent"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.10.4"

RPM_NAME = "malcontent-control-0.10.4-1.5.aarch64.rpm"
RPM_HASH = "80bc58d5edb8a8bee6409b6488d004d1083a76a8b90412fec57c10e8d90fa578954e5d7d44965d1b7294101c5cc37778c4a4a50df7f8fe9555b0c80d00040fb0"

RPROVIDES:${PN} += "application() \
application(org.freedesktop.MalcontentControl.desktop) \
malcontent-control \
malcontent-control(aarch-64) \
metainfo() \
metainfo(org.freedesktop.MalcontentControl.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaccountsservice.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libmalcontent-ui-0.so.0()(64bit) \
libpolkit-gobject-1.so.0()(64bit) \
malcontent"

inherit rpm
