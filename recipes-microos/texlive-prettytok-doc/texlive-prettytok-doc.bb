SUMMARY = "Documentation for texlive-prettytok"
DESCRIPTION = "This package includes the documentation for texlive-prettytok"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.1svn63842"

RPM_NAME = "texlive-prettytok-doc-2023.201.0.0.0.1svn63842-52.1.noarch.rpm"
RPM_HASH = "db3c0bfb8e17172c4651eae3efb27063b7b02d7b65f3f79756d4c6d7c64e70fa8f277759f64fc07023b6ddae260e030b977cdc862b6d8f4ca8778ea97e0075dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prettytok-doc"
RDEPENDS:${PN} += ""

inherit rpm
