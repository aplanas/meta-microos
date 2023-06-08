SUMMARY = "Documentation for texlive-parnotes"
DESCRIPTION = "This package includes the documentation for texlive-parnotes"
LICENSE = "LPPL-1.0"

PV = "2023.201.3bsvn51720"

RPM_NAME = "texlive-parnotes-doc-2023.201.3bsvn51720-51.1.noarch.rpm"
RPM_HASH = "633e3783e1d80c00c015a281a58bc17185e193b7eff6b74f8c9046c8f465a268784d86880add1285c4a9914f5f2bb6a3638a86fa28d049a1d2c6afeee020f432"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-parnotes-doc"
RDEPENDS:${PN} += ""

inherit rpm
