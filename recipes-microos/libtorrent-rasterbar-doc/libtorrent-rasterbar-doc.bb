SUMMARY = "Documentation for libtorrent-rasterbar"
DESCRIPTION = "Documentation for the libtorrent-rasterbar package."
LICENSE = "BSD-3-Clause"

PV = "2.0.8"

RPM_NAME = "libtorrent-rasterbar-doc-2.0.8-2.2.noarch.rpm"
RPM_HASH = "a836826031d34514af7ba7a480da9218d7f7daf1e2af1e5f7ab28582d3ba98f0aa4a691c59d9ed8b03c300e97484ea980e9390ecc5764cee7fec0902055b2ece"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libtorrent-rasterbar-doc"
RDEPENDS:${PN} += ""

inherit rpm
