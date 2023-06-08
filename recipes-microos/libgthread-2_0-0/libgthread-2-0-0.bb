SUMMARY = "Portable API from glib wrapping system threads"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
The libgthread library provides a portable way to write multi-threaded \
software."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.2"

RPM_NAME = "libgthread-2_0-0-2.76.2-1.1.aarch64.rpm"
RPM_HASH = "5d1d0998c297ba37039a329ee68d110daaac39812637fb242bffa5d6ca67ac0832f073cb1c9274908b7d537ab469b88eab526bf237108812a496d15dbb705308"

RPROVIDES:${PN} += "libgthread-2.0.so.0()(64bit) libgthread-2_0-0 libgthread-2_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libglib-2.0.so.0()(64bit)"

inherit rpm
