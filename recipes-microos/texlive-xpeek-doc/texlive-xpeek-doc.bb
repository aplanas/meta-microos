SUMMARY = "Documentation for texlive-xpeek"
DESCRIPTION = "This package includes the documentation for texlive-xpeek"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn61719"

RPM_NAME = "texlive-xpeek-doc-2023.201.0.0.2svn61719-52.1.noarch.rpm"
RPM_HASH = "0b68072913d5d421c30bf24a5566f9f763dd3206ca9697af52c726eb2e6f90a0d27434d11e17d6fa07f99a0ac88e0e1bbf1d564e8db9ee553da25930b034cfb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpeek-doc"
RDEPENDS:${PN} += ""

inherit rpm
