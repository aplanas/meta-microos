SUMMARY = "Advanced Gtk+ Sequencer library development files"
DESCRIPTION = "Advanced Gtk+ Sequencer library development files."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "4.5.5"

RPM_NAME = "gsequencer-devel-4.5.5-1.1.aarch64.rpm"
RPM_HASH = "a67632cb4a39ee90612316a737a3f8798220cbd61b48308b108cac4af7ca0f71ddd104c6a25242e25b3ce96043d13d1728c15966c88104421119b765c321cdb3"

RPROVIDES:${PN} += "gsequencer-devel gsequencer-devel(aarch-64) pkgconfig(libags) pkgconfig(libags_audio) pkgconfig(libags_gui) pkgconfig(libgsequencer)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libags4 libgsequencer0 pkgconfig(alsa) pkgconfig(cairo) pkgconfig(fontconfig) pkgconfig(gdk-pixbuf-2.0) pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gmodule-2.0) pkgconfig(gobject-2.0) pkgconfig(gstreamer-1.0) pkgconfig(gstreamer-base-1.0) pkgconfig(gthread-2.0) pkgconfig(gtk4) pkgconfig(jack) pkgconfig(libags) pkgconfig(libinstpatch-1.0) pkgconfig(libsoup-3.0) pkgconfig(libxml-2.0) pkgconfig(sndfile) pkgconfig(uuid)"

inherit rpm
