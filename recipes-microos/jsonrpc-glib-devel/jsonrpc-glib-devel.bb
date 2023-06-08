SUMMARY = "Development environment for jsonrpc-glib"
DESCRIPTION = "This is a library to communicate with JSON-RPC based peers in \
either a synchronous or an asynchronous fashion. It also allows \
communicating using the GVariant serialization format instead \
of JSON when both peers support it. \
 \
This package contains all files necessary for development using \
Jsonrpc-GLib."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.0"

RPM_NAME = "jsonrpc-glib-devel-3.44.0-1.1.aarch64.rpm"
RPM_HASH = "3da978fc29c74173d7f9c56c3ab89ab46c9e19fb222f20fb8cfa914b2e97d0fc0a3309c7a791819d0f8cec88988021b2532b123fee1eaf2a8d858dcc627e92d4"

RPROVIDES:${PN} += "jsonrpc-glib-devel jsonrpc-glib-devel(aarch-64) pkgconfig(jsonrpc-glib-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libjsonrpc-glib-1_0-1 pkgconfig(gio-2.0) pkgconfig(json-glib-1.0) typelib-1_0-Jsonrpc-1_0"

inherit rpm
