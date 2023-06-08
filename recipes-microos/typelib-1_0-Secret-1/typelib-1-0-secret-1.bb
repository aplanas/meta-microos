SUMMARY = "Introspection bindings for the Secret Service API library"
DESCRIPTION = "libsecret is a library for storing and retrieving passwords and other \
secrets. It communicates with the 'Secret Service' using DBus. \
 \
This package provides the GObject Introspection bindings for libsecret."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.5"

RPM_NAME = "typelib-1_0-Secret-1-0.20.5-1.7.aarch64.rpm"
RPM_HASH = "4477f5165def4cfb68494caf7879dc8b44d44598291a717471cb8e65f46bb3c95a082d80b24d5cb2d431217730a20232ad3d6988dbc6ebd73f83b3a68e5bd74b"

RPROVIDES:${PN} += "typelib(Secret) typelib-1_0-Secret-1 typelib-1_0-Secret-1(aarch-64)"
RDEPENDS:${PN} += "libsecret-1.so.0()(64bit) typelib(GLib) typelib(GObject) typelib(Gio)"

inherit rpm
