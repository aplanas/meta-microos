SUMMARY = "GNU Data Access (GDA) Library -- Introspection bindings"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data. \
 \
This package provides the GObject Introspection bindings for \
libgda."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "typelib-1_0-Gda-6_0-6.0.0-6.6.aarch64.rpm"
RPM_HASH = "6b53ba0e0e308d5753e49add2e48f838eea1374ab59d10969db28063ec2e5b72b1f9dd0b61e1c126515e6b8308ef73b82bcf16f446c3cb39cbcfe63dfd0e64aa"

RPROVIDES:${PN} += "typelib(Gda) typelib-1_0-Gda-6_0 typelib-1_0-Gda-6_0(aarch-64)"
RDEPENDS:${PN} += "libgda-6.0.so.6.0.0()(64bit) typelib(GLib) typelib(GObject) typelib(Gio) typelib(libxml2)"

inherit rpm
