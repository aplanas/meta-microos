SUMMARY = "C utilities collection library itself"
DESCRIPTION = "C utilities collection library itself."
LICENSE = "MIT"

PV = "0.0.20161208"

RPM_NAME = "libchck0-0.0.20161208-1.25.aarch64.rpm"
RPM_HASH = "ca05c8934e3718b784dddb66e691fcbd9015207375fe09dee4c7a3ca7caf7f498e32bf768813ac181404d85632d9684f845e8e3b691d77d8d2552887669a41c2"

RPROVIDES:${PN} += "libchck-atlas.so.0()(64bit) \
libchck-buffer.so.0()(64bit) \
libchck-dl.so.0()(64bit) \
libchck-fs.so.0()(64bit) \
libchck-lut.so.0()(64bit) \
libchck-pool.so.0()(64bit) \
libchck-sjis.so.0()(64bit) \
libchck-string.so.0()(64bit) \
libchck-tqueue.so.0()(64bit) \
libchck-unicode.so.0()(64bit) \
libchck-xdg.so.0()(64bit) \
libchck0 \
libchck0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
