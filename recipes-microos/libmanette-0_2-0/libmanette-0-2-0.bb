SUMMARY = "A simple GObject game controller library"
DESCRIPTION = "libmanette allows easy access to game controllers."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.6"

RPM_NAME = "libmanette-0_2-0-0.2.6-2.10.aarch64.rpm"
RPM_HASH = "4a8e79c23f513c16c31c41b487a1076c03dcbc2b92fe11a24bab6509434029223729808738c9d56795dc6af95b4edabd21d94736d84cbab122d50dad3377691d"

RPROVIDES:${PN} += "libmanette-0.2.so.0()(64bit) \
libmanette-0_2-0 \
libmanette-0_2-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libevdev.so.2()(64bit) \
libevdev.so.2(LIBEVDEV_1)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgudev-1.0.so.0()(64bit)"

inherit rpm
