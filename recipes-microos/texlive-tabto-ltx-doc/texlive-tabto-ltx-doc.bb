SUMMARY = "Documentation for texlive-tabto-ltx"
DESCRIPTION = "This package includes the documentation for texlive-tabto-ltx"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn54080"

RPM_NAME = "texlive-tabto-ltx-doc-2023.201.1.4svn54080-54.1.noarch.rpm"
RPM_HASH = "3c73253878ad772b4991b91cec7ee66d3f344c5cebdb2367e8c8e5b59b2ce66a22a8177d8c4fc493fe29912bcd0e4a75216ace9768d2c5a0b85811f02dbf78b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabto-ltx-doc"
RDEPENDS:${PN} += ""

inherit rpm
