SUMMARY = "Documentation for texlive-kotex-oblivoir"
DESCRIPTION = "This package includes the documentation for texlive-kotex-oblivoir"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2.1svn66513"

RPM_NAME = "texlive-kotex-oblivoir-doc-2023.201.3.2.1svn66513-55.1.noarch.rpm"
RPM_HASH = "dfa4b1e847738c7ae0a9e41a62f184d1f4187d3855643b47e24f87bd2be026b4430f2223eefd336ac8f00905f4fa0f58894a948e5143df1033f8824d5c8cbab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-kotex-oblivoir-doc:ko) \
texlive-kotex-oblivoir-doc"
RDEPENDS:${PN} += ""

inherit rpm
