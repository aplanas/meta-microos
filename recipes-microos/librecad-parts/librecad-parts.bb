SUMMARY = "Parts collection for LibreCAD"
DESCRIPTION = "Collection of parts for LibreCAD, a Qt application to design 2D \
CAD drawings."
LICENSE = "(Apache-2.0 | SUSE-GPL-3.0+-with-font-exception) & GPL-2.0-only"

PV = "2.2.0"

RPM_NAME = "librecad-parts-2.2.0-1.3.noarch.rpm"
RPM_HASH = "eae3a4f7d8e9b6333f2ad2e20c97a0da896ecc9657d4b17e7a776df639451aea9a8ec23b05c5114084ec0b57e7b22ca508d3f722ae2101d135352a9683b014b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "librecad-parts"
RDEPENDS:${PN} += "librecad"

inherit rpm
