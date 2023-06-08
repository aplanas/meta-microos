SUMMARY = "Node.js API documentation"
DESCRIPTION = "The API documentation for the Node.js JavaScript runtime."
LICENSE = "MIT"

PV = "19.9.0"

RPM_NAME = "nodejs19-docs-19.9.0-1.1.noarch.rpm"
RPM_HASH = "5bc5367073e54ed85517a8f943edb7dbff967e9d4d9c33ac59f6c1c667ae13a1a86bc3ec5ae64099369dae721ded804e6a60cbcdd5945216b6eba379fcd8ccc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nodejs19-docs"
RDEPENDS:${PN} += ""

inherit rpm
