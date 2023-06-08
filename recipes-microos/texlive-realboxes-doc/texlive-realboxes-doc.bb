SUMMARY = "Documentation for texlive-realboxes"
DESCRIPTION = "This package includes the documentation for texlive-realboxes"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn64967"

RPM_NAME = "texlive-realboxes-doc-2023.201.0.0.2svn64967-53.1.noarch.rpm"
RPM_HASH = "134de69b6cf329488dea026c5516bf158030c6a7326adb1213ec53a2c873762175681bf23ff6e8e0eacfa2ed6fcae4d713802b981fe127fdd69d197be36f4cdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-realboxes-doc"
RDEPENDS:${PN} += ""

inherit rpm
