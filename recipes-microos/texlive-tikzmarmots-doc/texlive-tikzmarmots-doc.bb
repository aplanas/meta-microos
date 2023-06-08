SUMMARY = "Documentation for texlive-tikzmarmots"
DESCRIPTION = "This package includes the documentation for texlive-tikzmarmots"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn54080"

RPM_NAME = "texlive-tikzmarmots-doc-2023.201.1.0svn54080-52.1.noarch.rpm"
RPM_HASH = "9703dbef009dacb8e2f2ef043c05399377c1f7df65dd9c5bc461ea1bac7e2f864037bd3f624e6df7afdb7322fdffeefda9fc9508eb48fa3daf8674dc8e890945"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzmarmots-doc"
RDEPENDS:${PN} += ""

inherit rpm
