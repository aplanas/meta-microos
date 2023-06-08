SUMMARY = "GNOME Backgrounds"
DESCRIPTION = "Background images from the GNOME project."
LICENSE = "CC-BY-SA-3.0"

PV = "44.0"

RPM_NAME = "gnome-backgrounds-44.0-1.1.noarch.rpm"
RPM_HASH = "44b739d3f704913dfc7d69f0712c8217555848addec503c570486ded4fba73d398c974d41ac13abe2b5c7d130a0305d3a02b6a1cbbb3196ebf229256e8fb444e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-backgrounds"
RDEPENDS:${PN} += "gdk-pixbuf-loader-rsvg webp-pixbuf-loader"

inherit rpm
