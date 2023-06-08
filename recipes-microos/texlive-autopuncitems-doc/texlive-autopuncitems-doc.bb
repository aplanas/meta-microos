SUMMARY = "Documentation for texlive-autopuncitems"
DESCRIPTION = "This package includes the documentation for texlive-autopuncitems"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63045"

RPM_NAME = "texlive-autopuncitems-doc-2023.201.svn63045-53.1.noarch.rpm"
RPM_HASH = "c2dd5ca54e8fe366fa073a9379fdf25d7be437f461b545168f4bf09ad7da68d880fa0f49626224f86b0ed3ae19a28cf1889fdee52ac3f6c6e5cfdf20706249bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-autopuncitems-doc"
RDEPENDS:${PN} += ""

inherit rpm
