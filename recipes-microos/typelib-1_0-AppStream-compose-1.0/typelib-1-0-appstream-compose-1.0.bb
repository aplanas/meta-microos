SUMMARY = "Introspection bindings for  AppStream Compose"
DESCRIPTION = "GObject introspection bindings for interfaces provided by AppStream Compose"
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.1"

RPM_NAME = "typelib-1_0-AppStream-compose-1.0-0.16.1-2.3.aarch64.rpm"
RPM_HASH = "796c8b71d92b1fd34092e929de6691c0ec8386a179cd3e818eb363f1aa7521ed97688009f79a20a554b6b1a8faa2b66b2088b6a1cd124942bc3110506fdcc506"

RPROVIDES:${PN} += "typelib(AppStreamCompose) typelib-1_0-AppStream-compose-1.0 typelib-1_0-AppStream-compose-1.0(aarch-64)"
RDEPENDS:${PN} += "libappstream-compose.so.0()(64bit) typelib(AppStream) typelib(GLib) typelib(GModule) typelib(GObject) typelib(GdkPixbuf) typelib(Gio)"

inherit rpm
