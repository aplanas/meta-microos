SUMMARY = "Introspection bindings for  AppStream Compose"
DESCRIPTION = "GObject introspection bindings for interfaces provided by AppStream Compose"
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.1"

RPM_NAME = "typelib-1_0-AppStream-compose-1.0-0.16.1-3.1.aarch64.rpm"
RPM_HASH = "61a7054df368e0db7133d2f93563b437a94e68c7e80e860851d25289d9971a10a4d95d5b58f503ee56e211a161965563be4c1d71bae2258f95c4ebd26e1d6e3f"

RPROVIDES:${PN} += "typelib(AppStreamCompose) typelib-1_0-AppStream-compose-1.0 typelib-1_0-AppStream-compose-1.0(aarch-64)"
RDEPENDS:${PN} += "libappstream-compose.so.0()(64bit) typelib(AppStream) typelib(GLib) typelib(GModule) typelib(GObject) typelib(GdkPixbuf) typelib(Gio)"

inherit rpm
