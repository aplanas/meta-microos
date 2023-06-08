SUMMARY = "General-Purpose Utility Library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.2"

RPM_NAME = "glib2-doc-2.76.2-1.1.aarch64.rpm"
RPM_HASH = "ad78120006d61c6c53aa2302e9624761e1300c8ac328c1320b300eaa4a32a048c731b51d3f55bb134e23d1720cd6a521ef02555580ea69c1ec7b75f4412711d3"

RPROVIDES:${PN} += "glib2-devel:/usr/share/gtk-doc/html/gobject/index.html glib2-doc glib2-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
