SUMMARY = "Documentation for texlive-fancytabs"
DESCRIPTION = "This package includes the documentation for texlive-fancytabs"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9svn41549"

RPM_NAME = "texlive-fancytabs-doc-2023.201.1.9svn41549-52.1.noarch.rpm"
RPM_HASH = "762dcbdb78313c4b039f08aa199c0eed3040586244a74fe83d6fc69118133de63a637f1491052d705da24dca709f5c3eaa866bf737913e122ea5e9e328f36136"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancytabs-doc"
RDEPENDS:${PN} += ""

inherit rpm
