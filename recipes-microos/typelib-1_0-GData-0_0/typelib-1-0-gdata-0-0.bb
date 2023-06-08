SUMMARY = "Introspection bindings for libgdata"
DESCRIPTION = "libgdata is a GLib-based library for accessing online service APIs using \
the GData protocol — most notably, Google's services. It provides APIs \
to access the common Google services, and has full asynchronous support. \
 \
This package provides the GObject Introspection bindings for the \
libgdata library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.18.1"

RPM_NAME = "typelib-1_0-GData-0_0-0.18.1-3.3.aarch64.rpm"
RPM_HASH = "5ccdd0d43dc99f34f74efff2e2bb05ccfffb63773d053a5b706a99cf73fff2a5afc14d8a1305252481bd27cd65989e2a62707f5130adf2a5380a990b9d86e71a"

RPROVIDES:${PN} += "typelib(GData) typelib-1_0-GData-0_0 typelib-1_0-GData-0_0(aarch-64)"
RDEPENDS:${PN} += "libgdata.so.22()(64bit) typelib(GLib) typelib(GObject) typelib(Gio) typelib(Goa) typelib(Json) typelib(Soup) typelib(libxml2)"

inherit rpm
