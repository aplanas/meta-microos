SUMMARY = "Object-Oriented Framework for C"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
The GObject library provides an object-oriented framework for C."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.2"

RPM_NAME = "libgobject-2_0-0-2.76.2-1.1.aarch64.rpm"
RPM_HASH = "f495b0695f5b68acd365a3ed90e76a51a181f80c68bb7359de7ce435c259ffd6ea3c8d1409ef22b48e1b33056a4fd280bff88d56996bfad4ead0cd9f70e4894f"

RPROVIDES:${PN} += "libgobject-2.0.so.0()(64bit) libgobject-2_0-0 libgobject-2_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libffi.so.8()(64bit) libffi.so.8(LIBFFI_BASE_8.0)(64bit) libglib-2.0.so.0()(64bit)"

inherit rpm
