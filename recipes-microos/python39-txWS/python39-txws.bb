SUMMARY = "Twisted WebSockets wrapper"
DESCRIPTION = "txWS (Twisted WebSockets) is a library for \
adding WebSockets server support to Twisted applications."
LICENSE = "X11"

PV = "0.9.1"

RPM_NAME = "python39-txWS-0.9.1-3.15.noarch.rpm"
RPM_HASH = "fd43858fd72599dff8473044431d3448bf4864265b2d16c22c32cde4c63403fcd15390cb45fc116c00ad5d20c753cf1dde3e52631b3418d7d26fbebb16f9a28d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(txws) python39-txWS python3dist(txws)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
