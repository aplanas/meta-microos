SUMMARY = "Change a directory or file emblem in Nemo"
DESCRIPTION = "Change a directory or a file emblem in Nemo, the Cinnamon desktop \
file manager."
LICENSE = "GPL-3.0-only"

PV = "5.2.0"

RPM_NAME = "nemo-extension-emblems-5.2.0-3.4.noarch.rpm"
RPM_HASH = "c456cb68fcd97f850dab71f1cae9ad1f6b8be6171ef8f3f155684d9ccd28c991cac4099668436b3e6d90f08cdffc3572fe347c3c63f16a641c786c9a0c883781"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-emblems nemo-extension-emblems python3.10dist(nemo-emblems) python3dist(nemo-emblems)"
RDEPENDS:${PN} += "nemo python3-gobject python3-gobject-Gdk typelib(GObject) typelib(Gio) typelib(Gtk) typelib(Nemo)"

inherit rpm
