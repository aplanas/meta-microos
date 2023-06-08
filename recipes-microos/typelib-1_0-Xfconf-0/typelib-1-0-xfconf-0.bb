SUMMARY = "Xfconf Shared Library"
DESCRIPTION = "GObject introspection bindings for Xfconf"
LICENSE = "GPL-2.0-or-later"

PV = "4.18.1"

RPM_NAME = "typelib-1_0-Xfconf-0-4.18.1-1.1.aarch64.rpm"
RPM_HASH = "6a4bc06733dbf9a089f9cce62609a885ea110af9b2305a3e9b377bdfd6d06d339312cb00f79936711057e7a9fcb26330795a75acafef6998cb4239df84149375"

RPROVIDES:${PN} += "typelib(Xfconf) typelib-1_0-Xfconf-0 typelib-1_0-Xfconf-0(aarch-64)"
RDEPENDS:${PN} += "libxfconf-0.so.3()(64bit) typelib(GLib) typelib(GObject) typelib(Gio)"

inherit rpm
