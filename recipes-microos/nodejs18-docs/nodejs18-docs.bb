SUMMARY = "Node.js API documentation"
DESCRIPTION = "The API documentation for the Node.js JavaScript runtime."
LICENSE = "MIT"

PV = "18.16.0"

RPM_NAME = "nodejs18-docs-18.16.0-1.1.noarch.rpm"
RPM_HASH = "fd293f39b4f5ce8b26fa4ba4d3546ef5b8b5c35238cdc45458765d2a66013338fbf77c36b7b39804606db5865009fb77efe0fca7368b07b48dd1809e69bd3998"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nodejs18-docs"
RDEPENDS:${PN} += ""

inherit rpm
