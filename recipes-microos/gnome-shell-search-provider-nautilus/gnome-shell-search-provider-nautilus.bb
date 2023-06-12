SUMMARY = "File Manager for the GNOME Desktop -- Search Provider for GNOME Shell"
DESCRIPTION = "Nautilus is the file manager for the GNOME desktop. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from Files (nautilus)"
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "44.2"

RPM_NAME = "gnome-shell-search-provider-nautilus-44.2-1.1.noarch.rpm"
RPM_HASH = "a12a139133dd860afa61f909c3ee145289e6b2125213d2d6bb4ab31b4bd549388081b443965b4351ee0ad77d742080865127da6690a89b025cbfff87fcc0e5ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-nautilus"
RDEPENDS:${PN} += "gnome-shell nautilus"

inherit rpm
