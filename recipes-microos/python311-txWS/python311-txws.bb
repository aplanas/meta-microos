SUMMARY = "Twisted WebSockets wrapper"
DESCRIPTION = "txWS (Twisted WebSockets) is a library for \
adding WebSockets server support to Twisted applications."
LICENSE = "X11"

PV = "0.9.1"

RPM_NAME = "python311-txWS-0.9.1-4.1.noarch.rpm"
RPM_HASH = "d98659e44ef9412b9a3d39c134fb8550c4aa8bceaa6b7e453c72c3ed880300f70fade2e4ccd74a61b36b2060a02083a373cfc40afa058a4fd32389ba98d639b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(txws) python311-txWS python3dist(txws)"
RDEPENDS:${PN} += "python(abi) python311-Twisted"

inherit rpm
