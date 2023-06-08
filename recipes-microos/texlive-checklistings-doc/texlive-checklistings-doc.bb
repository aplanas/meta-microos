SUMMARY = "Documentation for texlive-checklistings"
DESCRIPTION = "This package includes the documentation for texlive-checklistings"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn38300"

RPM_NAME = "texlive-checklistings-doc-2023.201.1.0svn38300-53.1.noarch.rpm"
RPM_HASH = "1774bbda07bd07cd5c8dfdbfa30dbfe3c150381b801e062554a3f7a1715bdcebb9939bd2f51c5b2ccba670e9a39b35c2ab66f357a16fac586c3ab8acb4407742"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-checklistings-doc"
RDEPENDS:${PN} += ""

inherit rpm
