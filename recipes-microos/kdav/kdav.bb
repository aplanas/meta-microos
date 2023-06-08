SUMMARY = "DAV protocol implementation"
DESCRIPTION = "kdav is a library providing a KJob-based implementation of DAV protocols such as \
CardDAV, WebDAV, and CalDAV."
LICENSE = "LGPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "kdav-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "b7dfff3024366beaf4c97965f25ff3d235483b4ed8aec177d76be554444efafcf9d26cf96d5b177fd3df8227ec00de764396735af99c07d210bd47a4e860a205"

RPROVIDES:${PN} += "kdav kdav(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
