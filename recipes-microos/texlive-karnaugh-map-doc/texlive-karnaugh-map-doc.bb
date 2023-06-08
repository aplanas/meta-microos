SUMMARY = "Documentation for texlive-karnaugh-map"
DESCRIPTION = "This package includes the documentation for texlive-karnaugh-map"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn61614"

RPM_NAME = "texlive-karnaugh-map-doc-2023.201.2.0svn61614-55.1.noarch.rpm"
RPM_HASH = "12f575870c1725fdff8ebc0705bb4afc5622156fe0e190e5bbc5fa217eb2ec9b3206ca1e5ba4e62beb778b3f544bb5c981747efcd58646021dca9ea321ccbc4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-karnaugh-map-doc"
RDEPENDS:${PN} += ""

inherit rpm
