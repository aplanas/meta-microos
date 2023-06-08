SUMMARY = "Libyui-qt-pkg header files"
DESCRIPTION = "This package contains the Qt package selector component for libyui. \
 \
This can be used independently of YaST for generic (C++) applications. \
This package has very few dependencies."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.5.2"

RPM_NAME = "libyui-qt-pkg-devel-4.5.2-1.1.aarch64.rpm"
RPM_HASH = "bd6b909b6a05a01bd871f179a10994d3f3e418d2b43fb73607abe5b23e29b88749e464947c191e1e74ba6efe425de145a139485dffaa914c86cb5145b77e0c6f"

RPROVIDES:${PN} += "libyui-qt-pkg-devel libyui-qt-pkg-devel(aarch-64)"
RDEPENDS:${PN} += "libyui-qt-devel libyui-qt-pkg16 libzypp-devel"

inherit rpm
