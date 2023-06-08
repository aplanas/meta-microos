SUMMARY = "Documentation for qt6-quick3dphysics in QCH format"
DESCRIPTION = "This package contains documentation for qt6-quick3dphysics in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3dphysics-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "8b64bbec4bbace9455e23bbc26ff0de5ea97ad6925e45aa977cf60b5ce0952fb9377160ccd8f364281e8e1567e7bfe7e0c93519ee7956a0008cf839cd1d2e9df"

RPROVIDES:${PN} += "qt6-quick3dphysics-docs-qch qt6-quick3dphysics-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
