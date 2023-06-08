SUMMARY = "GTK menu for sway and i3"
DESCRIPTION = "An attempt to create a simple menu, that behaves decently on sway, \
but also on i3 window manager. It uses pygobject to create a themeable, \
searchable gtk3-based system menu w/ some optional features."
LICENSE = "GPL-3.0-only"

PV = "1.4.1"

RPM_NAME = "sgtk-menu-1.4.1-1.6.aarch64.rpm"
RPM_HASH = "816cce80a2df57f437a6e68e20725f61bfceea37df8ba9fff923738e8e7a36ace49e825a5139729bdcb5c9fb94f4ddd30276e6dd9da0a161ecb60c47095f39c0"

RPROVIDES:${PN} += "python3.10dist(sgtk-menu) python3dist(sgtk-menu) sgtk-menu sgtk-menu(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-gobject"

inherit rpm
