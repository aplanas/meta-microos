SUMMARY = "Library to abstract stream and packet I/O"
DESCRIPTION = "This is gensio (pronounced gen'-see-oh), a framework for giving a \
consistent view of various stream (and packet) I/O types - python support"
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.1-only"

PV = "2.6.1"

RPM_NAME = "libgensio_python_swig0-2.6.1-1.4.aarch64.rpm"
RPM_HASH = "8bb1772561a98cc327ee31b4bb5ef31c1f3d6c0aee2815972f3a2d83394cb8ac35899c8fbb9a7b1aa60d1f3724c5da000218f0fe28440499b0b5c1c04329eea6"

RPROVIDES:${PN} += "libgensio0:/usr/lib/libgensio_python_swig.so.0.0.0 libgensio_python_swig.so.0()(64bit) libgensio_python_swig0 libgensio_python_swig0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgensioosh.so.0()(64bit) libpython3.10.so.1.0()(64bit)"

inherit rpm
