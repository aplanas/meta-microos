SUMMARY = "Cabinet file library"
DESCRIPTION = "gcab is a tool and library for manipulating cabinet files. \
 \
It uses the GObject API and provides GIR bindings. \
It supports creation of archives with simple MSZIP compression. \
 \
This package provides a system library to access cab files"
LICENSE = "LGPL-2.1-or-later"

PV = "1.5"

RPM_NAME = "libgcab-1_0-0-1.5-1.5.aarch64.rpm"
RPM_HASH = "e88f41b5bbfd3388d9a18a7be198425ff411225bf2140556389291f24e594ca86b24265be9437206b4fae9caad437e8500a4e330c43b3667ad56810bcb6ae935"

RPROVIDES:${PN} += "libgcab-1.0.so.0()(64bit) \
libgcab-1.0.so.0(LIBGCAB1_0.0)(64bit) \
libgcab-1.0.so.0(LIBGCAB1_0.2)(64bit) \
libgcab-1.0.so.0(LIBGCAB1_0.5)(64bit) \
libgcab-1.0.so.0(LIBGCAB1_0.6)(64bit) \
libgcab-1.0.so.0(LIBGCAB1_1.0)(64bit) \
libgcab-1.0.so.0(LIBGCAB1_1.4)(64bit) \
libgcab-1.0.so.0(LIBGCAB1_1.5)(64bit) \
libgcab-1_0-0 \
libgcab-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libz.so.1()(64bit)"

inherit rpm
