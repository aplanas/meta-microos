SUMMARY = "Japanese Dictionary Browser for GNOME/GTK+"
DESCRIPTION = "Gjiten is a GNOME-based Japanese dictionary program. It uses the \
JMdict/edict word dictionary, KANJIDIC kanji dictionary, and some of \
the xjdic code. Any combination of stroke count, radicals, and search \
key can be used for Kanji lookups. It requires a working X input \
method (such as ibus) for Japanese input."
LICENSE = "GPL-2.0-or-later"

PV = "3.1"

RPM_NAME = "gjiten-3.1-1.3.aarch64.rpm"
RPM_HASH = "8c8171b5143fb9cdb4ff00f1d7e93975e4d43472dd5dda7c17b35730e3ce70d78d16c9cc88aedd5f437db0a894af3655d7405f86b668d25226ec377ca0070463"

RPROVIDES:${PN} += "application() \
application(gjiten.desktop) \
gjiten \
gjiten(aarch-64) \
locale(libgnome:ja)"
RDEPENDS:${PN} += "edict \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
