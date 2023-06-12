SUMMARY = "Nemo extension to enable an embedded terminal"
DESCRIPTION = "Nemo Terminal is an embedded terminal for Nemo, the Cinnamon file \
manager. It embeds a terminal pane into Nemo that is accessible by \
hotkey (default F4) and automatically follows the currently active \
directory in Nemo."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-terminal-5.2.0-3.4.noarch.rpm"
RPM_HASH = "adffda7d71764add9a10c88f1551f784da9ca1aa1a47af055083efc59b1505bd64946f2204f6f17984cf7c7cc09fb049bd8712165276e926b3aa29a53e9dedb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-terminal \
nemo-terminal \
python3.10dist(nemo-terminal) \
python3dist(nemo-terminal)"
RDEPENDS:${PN} += "/usr/bin/python3 \
nemo \
python(abi) \
python3-gobject \
python3-gobject-Gdk \
python3-nemo \
typelib(GLib) \
typelib(GObject) \
typelib(Gdk) \
typelib(Gio) \
typelib(Gtk) \
typelib(Nemo) \
typelib(Vte) \
typelib(XApp)"

inherit rpm
