SUMMARY = "Documentation for texlive-archivo"
DESCRIPTION = "This package includes the documentation for texlive-archivo"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.0.2svn57283"

RPM_NAME = "texlive-archivo-doc-2023.201.0.0.0.2svn57283-54.1.noarch.rpm"
RPM_HASH = "10bed2ed0c125c2bbacfb3504726b10b43ccbc2e364ff108749371b29a728c313cda651b9f0a1237dae98fafa0a5bf4c0e5e858490a831f650344b63db28cd9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-archivo-doc"
RDEPENDS:${PN} += ""

inherit rpm
