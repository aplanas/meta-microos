SUMMARY = "Documentation for texlive-pgfornament-han"
DESCRIPTION = "This package includes the documentation for texlive-pgfornament-han"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54191"

RPM_NAME = "texlive-pgfornament-han-doc-2023.201.svn54191-51.1.noarch.rpm"
RPM_HASH = "fb74f2ddd903d1f565e5c22b75e6ae3d87993d48b266e23e8b3b56d0aedee5ecbe3eb3377b3db704ecf0b46f14acd52df31bc6dc3354c1ce1102822e5a37504e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pgfornament-han-doc:zh) \
texlive-pgfornament-han-doc"
RDEPENDS:${PN} += ""

inherit rpm
