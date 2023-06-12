SUMMARY = "A calendar widget for GTK using PyGoocanvas"
DESCRIPTION = "A calendar widget for GTK using PyGoocanvas (Gnome widget linrary)."
LICENSE = "GPL-2.0-only"

PV = "0.8.0"

RPM_NAME = "python311-GooCalendar-0.8.0-1.2.noarch.rpm"
RPM_HASH = "8f1abd0d297622c414a6a5d2e08591f86e4f1aeb55154501b4456939e72d2e1b33ed53d0c3590fa5e84532d5aa7b661b4b6c18a07b5ba23a2367a191a6e54d9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(goocalendar) \
python311-GooCalendar \
python3dist(goocalendar)"
RDEPENDS:${PN} += "python(abi) \
typelib(GObject) \
typelib(Gdk) \
typelib(GooCanvas) \
typelib(Gtk) \
typelib(Pango)"

inherit rpm
