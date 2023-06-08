SUMMARY = "File Manager for the GNOME Desktop -- Search Provider for GNOME Shell"
DESCRIPTION = "Nautilus is the file manager for the GNOME desktop. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from Files (nautilus)"
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "44.1"

RPM_NAME = "gnome-shell-search-provider-nautilus-44.1-1.1.noarch.rpm"
RPM_HASH = "c0c06a6be58204dc3023eb2681b41ef17b963f945921c9ac09692fdc2b984311aa53c5619b825a490850287fc8e2eff809412b962b51c521d556bd7508e44e36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-nautilus"
RDEPENDS:${PN} += "gnome-shell nautilus"

inherit rpm
