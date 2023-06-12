SUMMARY = "CompizConfig Manager Backend"
DESCRIPTION = "The backend to Compiz Config Manager."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "python3-ccm-0.8.18-2.10.noarch.rpm"
RPM_HASH = "76363cc325d8648c63584410cb8f84642dfcba7107abb5a72d2ab2ad362f79fb6ed4ac1e00d9ee273b4b6c82f0a90d99262b8a541512d14797c5f6a85c0fca6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ccm \
python3.10dist(ccsm) \
python3dist(ccsm)"
RDEPENDS:${PN} += "compiz \
compizconfig-settings-manager-common \
python(abi) \
python3-cairo \
python3-compizconfig \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
python3-xml \
typelib(GLib) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(Pango) \
typelib(PangoCairo)"

inherit rpm
