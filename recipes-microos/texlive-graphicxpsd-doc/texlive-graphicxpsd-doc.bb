SUMMARY = "Documentation for texlive-graphicxpsd"
DESCRIPTION = "This package includes the documentation for texlive-graphicxpsd"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn57341"

RPM_NAME = "texlive-graphicxpsd-doc-2023.201.1.2svn57341-53.1.noarch.rpm"
RPM_HASH = "05660dc73546a8288b9bf6b6de4642d03a9fa6b2bbf571261a37980e97b62a8d5794574c5271fed83cc98240ddd8da58e89b747e3d813433b1499ddcf74048b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphicxpsd-doc"
RDEPENDS:${PN} += ""

inherit rpm
