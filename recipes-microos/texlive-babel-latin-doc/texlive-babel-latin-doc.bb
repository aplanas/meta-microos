SUMMARY = "Documentation for texlive-babel-latin"
DESCRIPTION = "This package includes the documentation for texlive-babel-latin"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.0svn59800"

RPM_NAME = "texlive-babel-latin-doc-2023.201.4.0svn59800-53.1.noarch.rpm"
RPM_HASH = "5d243a0c1b6b56158fb5c2a5701cbfffdccf1831e98d2dfd68b3e5eec966988bdcf2ce5785e304daf42510231aabdaccfd6e6be5a0edb48760059005489c2656"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-latin-doc"
RDEPENDS:${PN} += ""

inherit rpm
