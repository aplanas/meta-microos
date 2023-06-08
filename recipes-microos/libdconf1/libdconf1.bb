SUMMARY = "Key-based configuration system"
DESCRIPTION = "dconf is a low-level configuration system. Its main purpose is to \
provide a backend to GSettings on platforms that don't already \
have configuration storage systems."
LICENSE = "LGPL-2.1-or-later"

PV = "0.40.0"

RPM_NAME = "libdconf1-0.40.0-3.3.aarch64.rpm"
RPM_HASH = "db67fac8927ad150c4b8fdf2366428be30752366a53e4599034d69498bd69b735c9ec1ef3dcbfb695737e8b360e0411066f3bfbee165c75c000d049739422d22"

RPROVIDES:${PN} += "libdconf.so.1()(64bit) libdconf1 libdconf1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig dconf ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
