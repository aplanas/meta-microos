SUMMARY = "Handbook for the mtpaint painting application"
DESCRIPTION = "Documentation for the painting application mtpaint."
LICENSE = "GFDL-1.2-only"

PV = "3.50"

RPM_NAME = "mtpaint-handbook-3.50-1.10.noarch.rpm"
RPM_HASH = "6d389f5b297bb1c823bf0e0672e9c493f6964b717d7e9e907d876dfd07441dfdf564743e43023dfb2b66ceca58df4d581660d306eb2cecfd07246355f118b5bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mtpaint-handbook"
RDEPENDS:${PN} += "mtpaint"

inherit rpm
