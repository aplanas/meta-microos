SUMMARY = "Mahjong Solitaire Game for GNOME"
DESCRIPTION = "Mahjongg is a solitaire version of the classic Eastern tile game. It \
involves clearing as much of the board as possible by matching \
corresponding tiles and taking them out of play."
LICENSE = "GPL-2.0-or-later"

PV = "3.38.3"

RPM_NAME = "gnome-mahjongg-3.38.3-3.1.aarch64.rpm"
RPM_HASH = "2bda65bce3d05864ceef47f43c4d0fdd3bacd0b3f801af0854fcddc0c65ab2207431a1db1d38a0dca132a189d8098f9ccb8b55051db68354a4c6c804745cdc95"

RPROVIDES:${PN} += "application() application(org.gnome.Mahjongg.desktop) gnome-mahjongg gnome-mahjongg(aarch-64) mahjongg metainfo() metainfo(org.gnome.Mahjongg.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) librsvg-2.so.2()(64bit)"

inherit rpm
