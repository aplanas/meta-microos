SUMMARY = "Documentation for texlive-jpsj"
DESCRIPTION = "This package includes the documentation for texlive-jpsj"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.2svn66115"

RPM_NAME = "texlive-jpsj-doc-2023.201.1.2.2svn66115-55.1.noarch.rpm"
RPM_HASH = "f7e4c0c94d2cf0d002a48e55eefb2f548150d72374ebac5994511536a1cfdad35d394fc6eafac756a3bc7d25c49e7bd8013153629cf2bfe68fecb74059b19399"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jpsj-doc"
RDEPENDS:${PN} += ""

inherit rpm
