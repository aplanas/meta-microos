SUMMARY = "Chinese Lunar calendar introspection bindings"
DESCRIPTION = "Introspection bindings for Chinese Lunar calendar for use in Gnome Shell"
LICENSE = "GPL-2.0-or-later"

PV = "2.9.3"

RPM_NAME = "typelib-1_0-LunarDate-3_0-2.9.3-2.14.aarch64.rpm"
RPM_HASH = "bbb8c6fbb437664ef06156c37a807b401ce8e9b083f5b3c0fb8567d6c72b1f32a1f7fef9b008107acd1269f875bf7a18744318c35fd675e4605548f16942f9c6"

RPROVIDES:${PN} += "typelib(LunarDate) typelib-1_0-LunarDate-3_0 typelib-1_0-LunarDate-3_0(aarch-64)"
RDEPENDS:${PN} += "liblunar-date-3.0.so.1()(64bit) typelib(GLib) typelib(GObject)"

inherit rpm
