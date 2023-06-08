SUMMARY = "Note editor for GNOME -- Search Provider for GNOME Shell"
DESCRIPTION = "It is the same note taking application, including most of the add-ins (more are \
to come). Synchronization support is being worked on. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from documents."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-shell-search-provider-gnote-44.0-1.1.noarch.rpm"
RPM_HASH = "5e879fad2a8d312e7115e0488ba9d8af928c2ee72f53a58b38daf009d75475699f68288efd7fa77e715344753fb3b43b7205832bb4bc796aea68b8b708f41f92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnote"
RDEPENDS:${PN} += "gnome-shell gnote"

inherit rpm
