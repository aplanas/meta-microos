SUMMARY = "A calendar widget for GTK using PyGoocanvas"
DESCRIPTION = "A calendar widget for GTK using PyGoocanvas (Gnome widget linrary)."
LICENSE = "GPL-2.0-only"

PV = "0.8.0"

RPM_NAME = "python39-GooCalendar-0.8.0-1.2.noarch.rpm"
RPM_HASH = "648a03fdd7a3e9e367a2dfabcd480e5c9870c713d4deafd6d6795712437c534a8a9d1dfacf2b3ab3f2456fc4cf65933e6a72a1c5cf65e13a4edb1e0633db1b90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(goocalendar) \
python39-GooCalendar \
python3dist(goocalendar)"
RDEPENDS:${PN} += "python(abi) \
typelib(GObject) \
typelib(Gdk) \
typelib(GooCanvas) \
typelib(Gtk) \
typelib(Pango)"

inherit rpm
