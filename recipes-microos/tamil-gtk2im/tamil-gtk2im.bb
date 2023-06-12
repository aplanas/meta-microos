SUMMARY = "Tamil99 Keyboard Input module for GTK2"
DESCRIPTION = "Tamil99 Keyboard Input module for GTK2 \
 \
Authors: \
-------- \
    Dinesh Nadarajah <dinesh_list@sbcglobal.net>"
LICENSE = "BSD-3-Clause"

PV = "2.2"

RPM_NAME = "tamil-gtk2im-2.2-302.11.aarch64.rpm"
RPM_HASH = "6bbe673e9c7455541bd59af8a3914adff6dc729d3ad7f7bfa9536c343956c3d82ac0b5755ba5187b26f0dc6ad62bc2d3eaa40b18c350de5fd28fe81a11b2c800"

RPROVIDES:${PN} += "locale(gtk2:ta) \
tamil-gtk2im \
tamil-gtk2im(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/touch \
gtk2 \
gtk2-tools \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
