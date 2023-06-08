SUMMARY = "Documentation for texlive-pgf-periodictable"
DESCRIPTION = "This package includes the documentation for texlive-pgf-periodictable"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.0svn66010"

RPM_NAME = "texlive-pgf-periodictable-doc-2023.201.2.0.0svn66010-51.1.noarch.rpm"
RPM_HASH = "daf228c7588b2c5639503466707f9861570357acf4d4c0eb9957dcf5813742f6388b36e0ae22e10884584d2f3a3603cc32b0d8d447d7914b8cbcb8f05448d116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgf-periodictable-doc"
RDEPENDS:${PN} += ""

inherit rpm
