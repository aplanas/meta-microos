SUMMARY = "GNOME Clocks -- Search Provider for GNOME Shell"
DESCRIPTION = "This package contains a search provider to enable GNOME Shell to get \
search results from GNOME Clocks."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-shell-search-provider-gnome-clocks-44.0-1.1.noarch.rpm"
RPM_HASH = "c8c47767d5a35daa39503b679228a8144bb63bfc9dbe75e3d7b734d5078a4fd362c939b5a2e433bdedbe851ed777ccfc813e0626e10b22db2473de2fa6428c93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnome-clocks"
RDEPENDS:${PN} += "gnome-clocks"

inherit rpm
