SUMMARY = "The Flexible Context-aware Input Tool with eXtension -- Introspection bindings"
DESCRIPTION = "Fcitx is a CJK input method framework. It supports Table, \
Pinyin and QuWei input methods. It's flexible and fast. \
 \
This package provides the GObject Introspection bindings for Fcitx."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "typelib-1_0-Fcitx-1_0-4.2.9.9-1.5.aarch64.rpm"
RPM_HASH = "7b3b7c3a8be77b1085b25e29e932c442214a488389e113aa86142e3d188a88011c80651d31a5b80c17617be3b4cff2f92641d36f5e7842ecf5ad5e4b63520ff6"

RPROVIDES:${PN} += "typelib(Fcitx) typelib-1_0-Fcitx-1_0 typelib-1_0-Fcitx-1_0(aarch-64)"
RDEPENDS:${PN} += "libfcitx-gclient.so.1()(64bit) typelib(GLib) typelib(GObject) typelib(Gio)"

inherit rpm
