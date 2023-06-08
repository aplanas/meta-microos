SUMMARY = "Documentation for qt6-quick3dphysics in HTML format"
DESCRIPTION = "This package contains documentation for qt6-quick3dphysics in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3dphysics-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "60837e46a982bcaa1a013d366b1f8f43b4d11a1ad1481c32ca8eea606beee598068e21c38c04f0b2dc0530ecaecd809146a8f1c089d60a035c6b7a9e254fc906"

RPROVIDES:${PN} += "qt6-quick3dphysics-docs-html qt6-quick3dphysics-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
