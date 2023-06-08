SUMMARY = "GNOME music playing application - gnome-shell search provider"
DESCRIPTION = "Lollypop is a GNOME music playing application. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from lollypop."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.37"

RPM_NAME = "gnome-shell-search-provider-lollypop-1.4.37-1.2.noarch.rpm"
RPM_HASH = "9391afa1fc07d18a5130803017fe1e33a09b89ddf58bc10978bcbcdefd1615b83b9915ee6aa574565b35fde6a47e275ca7e8dbddf2a683e5c232368d483ca75b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-lollypop"
RDEPENDS:${PN} += "/usr/bin/python3 gnome-shell lollypop"

inherit rpm
