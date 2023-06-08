SUMMARY = "Documentation for texlive-kvsetkeys"
DESCRIPTION = "This package includes the documentation for texlive-kvsetkeys"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.19svn64632"

RPM_NAME = "texlive-kvsetkeys-doc-2023.201.1.19svn64632-55.1.noarch.rpm"
RPM_HASH = "7459e70a319c6a6b6f840223de7083a1bfb284a5621e3e7a952f100cb1561198ad4a6d1ac87ab08cba64725a94ea0023b2271217fdb59422f8a76d51552ddc1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-kvsetkeys-doc:en) texlive-kvsetkeys-doc"
RDEPENDS:${PN} += ""

inherit rpm
