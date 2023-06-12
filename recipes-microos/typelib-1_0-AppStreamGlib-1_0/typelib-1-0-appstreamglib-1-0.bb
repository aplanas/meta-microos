SUMMARY = "Introspection bindings for the AppStream abstraction library"
DESCRIPTION = "This library provides GObjects and helper methods to read and write \
AppStream metadata. It also provides a DOM implementation to edit \
nodes and convert to and from the standardized XML representation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "typelib-1_0-AppStreamGlib-1_0-0.8.2-1.3.aarch64.rpm"
RPM_HASH = "d434135c5ef12e215a83a65fb902cceae6e523953ede030810a8a7d82d00bd03f6dda8bfb82cf7cd4117bdea3a6f73383665e8612d9aa9768ef7572fac1a4002"

RPROVIDES:${PN} += "typelib(AppStreamGlib) \
typelib-1_0-AppStreamGlib-1_0 \
typelib-1_0-AppStreamGlib-1_0(aarch-64)"
RDEPENDS:${PN} += "libappstream-glib.so.8()(64bit) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(GdkPixbuf) \
typelib(Gio)"

inherit rpm
