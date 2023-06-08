SUMMARY = "Documentation for texlive-garamond-math"
DESCRIPTION = "This package includes the documentation for texlive-garamond-math"
LICENSE = "OFL-1.1"

PV = "2023.201.svn61481"

RPM_NAME = "texlive-garamond-math-doc-2023.201.svn61481-52.1.noarch.rpm"
RPM_HASH = "49f803ef2d44029d2f6404375bd26160fce0929eef298798065435b823d9e5f400913651dd97045996ddaf39203393ba6ab4a960306e6dc539020f32e8efd245"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-garamond-math-doc"
RDEPENDS:${PN} += ""

inherit rpm
