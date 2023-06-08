SUMMARY = "Documentation for texlive-spelling"
DESCRIPTION = "This package includes the documentation for texlive-spelling"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.41svn30715"

RPM_NAME = "texlive-spelling-doc-2023.201.0.0.41svn30715-57.1.noarch.rpm"
RPM_HASH = "1d4ab669a33b84ca0250f9e469eaeca99da4ed039c80125d85817649a2616d15f5889f6834949498dcf245a90ffffaac0a95b1303e604eb281df02df05e94c8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spelling-doc"
RDEPENDS:${PN} += ""

inherit rpm
