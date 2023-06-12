SUMMARY = "Git repository viewer -- Catalog for Glade"
DESCRIPTION = "gitg is a GitX clone for GNOME/gtk+. It aims at being a small, fast and \
convenient tool to visualize git history and actions that benefit from a \
graphical presentation. \
 \
This package provides a catalog for Glade, to allow the use the gitg \
widgets in Glade."
LICENSE = "GPL-2.0-or-later"

PV = "41"

RPM_NAME = "glade-catalog-gitg-41-2.8.aarch64.rpm"
RPM_HASH = "cd1ed82360a4cbb13e2661ce127f7cb5d827bfee510d7d197bc6533d24c338d84de08e3d05381638e6f35b479668dafb2e062c4470d1e60bd42ff7f43b43deef"

RPROVIDES:${PN} += "glade-catalog-gitg \
glade-catalog-gitg(aarch-64)"
RDEPENDS:${PN} += "glade \
libgitg-1_0-0"

inherit rpm
