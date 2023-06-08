SUMMARY = "Documentation for texlive-chextras"
DESCRIPTION = "This package includes the documentation for texlive-chextras"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn27118"

RPM_NAME = "texlive-chextras-doc-2023.201.1.01svn27118-53.1.noarch.rpm"
RPM_HASH = "6c2320ef2be0691bb18ceca30b1a70d1202b57218e35888a7679690ef75e8b767b4dcff20421eadf49563e99bd8b5dd9d26bfe8de055e86ccf836012490fda42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chextras-doc"
RDEPENDS:${PN} += ""

inherit rpm
