SUMMARY = "Documentation for texlive-charter"
DESCRIPTION = "This package includes the documentation for texlive-charter"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-charter-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "de000ced71c1f426bb657898dbbf56b15d4317d138732381797d7e30e7752834e7d7ffe338d8226182b66b1b174aa351b8dd92b104ed8cb72bb089c8b53ddc76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-charter-doc"
RDEPENDS:${PN} += ""

inherit rpm
