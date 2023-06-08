SUMMARY = "Introspection bindings for AppStream"
DESCRIPTION = "GObject introspection bindings for interfaces provided by AppStream."
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.1"

RPM_NAME = "typelib-1_0-AppStream-1.0-0.16.1-2.3.aarch64.rpm"
RPM_HASH = "df022a7c6a91815229ad23a7641095ab5257907e00659d952dc94ab16089a4d86e50c7620183c8df5dddb6c39be0a2724617668ada0af6cfe39702bd9486dff4"

RPROVIDES:${PN} += "typelib(AppStream) typelib-1_0-AppStream-1.0 typelib-1_0-AppStream-1.0(aarch-64)"
RDEPENDS:${PN} += "libappstream.so.4()(64bit) typelib(GLib) typelib(GObject) typelib(Gio)"

inherit rpm
