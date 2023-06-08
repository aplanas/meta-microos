SUMMARY = "Static libraries for glib, a general-purpose utility library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
This package contains static versions of the GLib libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.2"

RPM_NAME = "glib2-devel-static-2.76.2-1.1.aarch64.rpm"
RPM_HASH = "2fce883ed1ad4e9076e69a2a58ade2c33ac9b06f0430294149b3a09814d42e41b65d3c062cfae47a7caa777ead2ba724c34969180518b2c77552ecf954bd6311"

RPROVIDES:${PN} += "glib2-devel-static glib2-devel-static(aarch-64)"
RDEPENDS:${PN} += "glib2-devel"

inherit rpm
