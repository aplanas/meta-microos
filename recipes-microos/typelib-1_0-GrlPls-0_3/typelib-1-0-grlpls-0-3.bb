SUMMARY = "Introspection bindings for grilo"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API. \
 \
This package provides the GObject Introspection bindings for the \
libgrlnet library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.15"

RPM_NAME = "typelib-1_0-GrlPls-0_3-0.3.15-2.1.aarch64.rpm"
RPM_HASH = "e476986f5e38ac3e2ec0850cf5460937be015d30b6529d3cedae3afc63c74fcac912247fe1d6ea80611ab910c6d72e1d37bbacf4db712bdcb91d943b9dfa7130"

RPROVIDES:${PN} += "typelib(GrlPls) typelib-1_0-GrlPls-0_3 typelib-1_0-GrlPls-0_3(aarch-64)"
RDEPENDS:${PN} += "libgrlpls-0.3.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gio) typelib(Grl)"

inherit rpm
