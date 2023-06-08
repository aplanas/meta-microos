SUMMARY = "Introspection bindings for fcitx5"
DESCRIPTION = "This package provides the GObject Introspection bindings for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.22"

RPM_NAME = "typelib-1_0-FcitxG-1_0-5.0.22-1.3.aarch64.rpm"
RPM_HASH = "4927bc18253f5278f7e39fd16fdc1b23e53728caa988b291c73024e3a17d6c618a1e6dacfa376095c37e5eebcef20767a6ffe8081b15ca6dbbec3401a0bf67a3"

RPROVIDES:${PN} += "typelib(FcitxG) typelib-1_0-Fcitx-1_0 typelib-1_0-FcitxG-1_0 typelib-1_0-FcitxG-1_0(aarch-64)"
RDEPENDS:${PN} += "libFcitx5GClient.so.2()(64bit) typelib(GLib) typelib(GObject) typelib(Gio)"

inherit rpm
