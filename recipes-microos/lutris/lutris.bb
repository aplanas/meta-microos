SUMMARY = "Manager for game installation and execution"
DESCRIPTION = "Lutris allows to gather and manage (install, configure and launch) \
all games acquired from any source, in a single interface. \
This includes, for example, Steam or GOG games, Windows games (WINE), \
or emulated console games and browser games."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.12"

RPM_NAME = "lutris-0.5.12-3.1.noarch.rpm"
RPM_HASH = "1085bc941756335b287922003d0d1ac1d71e2a9e06cca129422428f3dd4f2b7072bb0af1ccca6122535bf1763a360189f47883cea525a2d5f46067302413709d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(net.lutris.Lutris.desktop) lutris metainfo() metainfo(net.lutris.Lutris.metainfo.xml) mimehandler(x-scheme-handler/lutris) python3.10dist(lutris) python3dist(lutris)"
RDEPENDS:${PN} += "/usr/bin/python3 cabextract curl fluid-soundfont-gm p7zip psmisc python(abi) python3-Pillow python3-PyYAML python3-cssselect python3-dbus-python python3-evdev python3-gobject python3-gobject-Gdk python3-lxml python3-requests typelib(AppIndicator3) typelib(GLib) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(GnomeDesktop) typelib(Gtk) typelib(Pango) typelib(WebKit2) xrandr"

inherit rpm
