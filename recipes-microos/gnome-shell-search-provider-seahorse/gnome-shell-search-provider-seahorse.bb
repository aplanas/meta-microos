SUMMARY = "GNOME interface for gnupg -- Search Provider for GNOME Shell"
DESCRIPTION = "Seahorse is a GNOME interface for gnupg. It uses gpgme as the backend. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from seahorse."
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "gnome-shell-search-provider-seahorse-43.0-3.4.noarch.rpm"
RPM_HASH = "c9abebaf4c84ecaf4b61227a9a06cfeb16ec7b5833a6e4622201bfe016453aada9832e542604e8aa5a894584bf7c494ffbf322da61797fbd80b3ecfb2247cc6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-seahorse"
RDEPENDS:${PN} += ""

inherit rpm
