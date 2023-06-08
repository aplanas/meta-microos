SUMMARY = "Devel files for python311-PyQt6-WebEngine"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python311-PyQt6-WebEngine"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-WebEngine-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "e1a03835f2a3b0a24cfab35b914a12f3d565d81c554f008f4139017d44962bf09991b8402785534259f51044bdd7352dbca0ebcf67cc8d676e0bf0933cacb519"

RPROVIDES:${PN} += "python311-PyQt6-WebEngine-devel python311-PyQt6-WebEngine-devel(aarch-64)"
RDEPENDS:${PN} += "python311-PyQt6-devel"

inherit rpm
