SUMMARY = "Documentation for texlive-breakurl"
DESCRIPTION = "This package includes the documentation for texlive-breakurl"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.40svn29901"

RPM_NAME = "texlive-breakurl-doc-2023.201.1.40svn29901-52.1.noarch.rpm"
RPM_HASH = "bd8d6f66bc9ed02667bfa21336c90d9de5c19042a82a91c701e90fa51e2aff5ee04bd8117e9640a5f95c440c4ed08102a31815936d7ac6fb99ec7551f043563e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-breakurl-doc"
RDEPENDS:${PN} += ""

inherit rpm
