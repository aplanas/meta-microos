SUMMARY = "JSON-RPC based peers lib -- Introspection bindings"
DESCRIPTION = "This is a library to communicate with JSON-RPC based peers in \
either a synchronous or an asynchronous fashion. It also allows \
communicating using the GVariant serialization format instead \
of JSON when both peers support it. \
 \
This package contains the Jsonrpc-GLib introspection bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.0"

RPM_NAME = "typelib-1_0-Jsonrpc-1_0-3.44.0-1.1.aarch64.rpm"
RPM_HASH = "8af07daafed8799526fd07ac246ab86e628ec1aaed3d4baf913ec2560120be022b5c79da80a8a5336248ab22394b63a206898ea888732fcb87d15802ea9d9ea0"

RPROVIDES:${PN} += "typelib(Jsonrpc) typelib-1_0-Jsonrpc-1_0 typelib-1_0-Jsonrpc-1_0(aarch-64)"
RDEPENDS:${PN} += "libjsonrpc-glib-1.0.so.1()(64bit) typelib(GLib) typelib(GObject) typelib(Gio)"

inherit rpm
