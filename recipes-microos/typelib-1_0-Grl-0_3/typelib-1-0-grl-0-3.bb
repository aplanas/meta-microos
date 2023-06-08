SUMMARY = "Framework for browsing and searching media content -- Introspection bindings"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API. \
 \
This package provides the GObject Introspection bindings for the \
libgrl library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.15"

RPM_NAME = "typelib-1_0-Grl-0_3-0.3.15-2.1.aarch64.rpm"
RPM_HASH = "cfab99a9adb440a3e853225073f134e3a8bc2916199a84875acdaf6f6ff47e0f498fb5864f962bce6c26011fb5149e091cb3bd03ae8f1d566fea8112a33aaa51"

RPROVIDES:${PN} += "typelib(Grl) typelib-1_0-Grl-0_3 typelib-1_0-Grl-0_3(aarch-64)"
RDEPENDS:${PN} += "libgrilo-0.3.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gio)"

inherit rpm
