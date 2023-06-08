SUMMARY = "Introspection bindings for the GNOME desktop Office files thumbnailer"
DESCRIPTION = "The libgsf library is an extensible I/O abstraction library for dealing \
with structured file formats."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.14.50"

RPM_NAME = "typelib-1_0-Gsf-1-1.14.50-1.5.aarch64.rpm"
RPM_HASH = "c6d08061db093fe39e62fd57810f5b841b773dd4490f1779d458eacc7c45b0ada4a9f7ebb5e7276ebae154582c36acf808dadb1858705392f7dc3f8dcb1b186f"

RPROVIDES:${PN} += "typelib(Gsf) typelib-1_0-Gsf-1 typelib-1_0-Gsf-1(aarch-64)"
RDEPENDS:${PN} += "libgsf-1.so.114()(64bit) typelib(GLib) typelib(GObject) typelib(Gio) typelib(libxml2)"

inherit rpm
