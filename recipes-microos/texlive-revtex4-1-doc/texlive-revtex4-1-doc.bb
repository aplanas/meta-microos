SUMMARY = "Documentation for texlive-revtex4-1"
DESCRIPTION = "This package includes the documentation for texlive-revtex4-1"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.1ssvn56590"

RPM_NAME = "texlive-revtex4-1-doc-2023.201.4.1ssvn56590-53.1.noarch.rpm"
RPM_HASH = "1303db7507233927ec51d8e0ca1647c020c0fc7454b5a6b503890883d5ed3cb24b1095d1a2e6ff3b98e290bc90110d3efc168f648fe02ade696fb33bb358f152"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-revtex4-1-doc"
RDEPENDS:${PN} += ""

inherit rpm
