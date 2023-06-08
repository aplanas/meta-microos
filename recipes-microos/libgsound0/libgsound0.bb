SUMMARY = "Shared library for gsound"
DESCRIPTION = "GSound is a library for playing system sounds. \
It's designed to be used via GObject Introspection, \
and is a wrapper around the libcanberra C library. \
 \
This package provides the shared library for gsound."
LICENSE = "LGPL-2.1-only"

PV = "1.0.3"

RPM_NAME = "libgsound0-1.0.3-2.8.aarch64.rpm"
RPM_HASH = "5644623ace9cee0aa96cc0f9d5483bd5e502504ce052ca1ac70a33fca15c4b268c8c85e0ed6a033591a92674041cdca56bdbc21807fa87534fbd986ee4c9f815"

RPROVIDES:${PN} += "libgsound.so.0()(64bit) libgsound0 libgsound0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcanberra.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
