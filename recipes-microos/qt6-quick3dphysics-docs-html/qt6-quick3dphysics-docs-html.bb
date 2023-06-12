SUMMARY = "Documentation for qt6-quick3dphysics in HTML format"
DESCRIPTION = "This package contains documentation for qt6-quick3dphysics in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dphysics-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "32f0789881577459b96de12cbc9dd801ab01b6f0182b9e6d64a650206280650f71db7844c5c8140a8dfa11e38b817f896ceab6b74517dbe2c4243b65503e39d0"

RPROVIDES:${PN} += "qt6-quick3dphysics-docs-html \
qt6-quick3dphysics-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
