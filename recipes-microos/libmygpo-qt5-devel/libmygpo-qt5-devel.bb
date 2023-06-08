SUMMARY = "Qt Library that wraps the gpodder.net Web API"
DESCRIPTION = "libmygpo-qt5 is a Qt Library that wraps the gpodder.net Web API (http://wiki.gpodder.org/wiki/Web_Services/API_2) \
 \
v1.0 wraps nearly every Request from the gpodder.net API except: \
- Simple API Calls Downloading subscription Lists & Uploading subscription Lists \
- Retrieving Subscription Changes (you should use 'Retrieving Updates for a given Device' instead)"
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libmygpo-qt5-devel-1.1.0-2.23.aarch64.rpm"
RPM_HASH = "d04793b81d6104e974cc25551f2041c1943a12733afdca3b5f5873e693634e0f9256dd5f472c9423f0959209daeb05a5ceb4f9ffc28e73c2f10c2a7efaf9ba08"

RPROVIDES:${PN} += "cmake(Mygpo-qt5) libmygpo-qt5-devel libmygpo-qt5-devel(aarch-64) pkgconfig(libmygpo-qt5)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmygpo-qt5-1 pkgconfig(Qt5Core) pkgconfig(Qt5Network)"

inherit rpm
