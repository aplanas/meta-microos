SUMMARY = "Account management library for GLib Applications -- Introspection Bindings"
DESCRIPTION = "This package contains the GObject Introspection bindings for the \
accounts-glib library."
LICENSE = "LGPL-2.1-only"

PV = "1.26"

RPM_NAME = "typelib-1_0-Accounts-1_0-1.26-1.3.aarch64.rpm"
RPM_HASH = "d9713cce845450511a83e013ab06d35e8eb59a36ea1f128ef9d2ee1453fde43535d527139142e3b6f87651daf63483cf30d5e98822b9afbbc4d691f184fea3f2"

RPROVIDES:${PN} += "typelib(Accounts) \
typelib-1_0-Accounts-1_0 \
typelib-1_0-Accounts-1_0(aarch-64)"
RDEPENDS:${PN} += "libaccounts-glib.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
