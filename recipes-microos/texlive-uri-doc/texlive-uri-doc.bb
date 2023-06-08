SUMMARY = "Documentation for texlive-uri"
DESCRIPTION = "This package includes the documentation for texlive-uri"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0bsvn48602"

RPM_NAME = "texlive-uri-doc-2023.201.2.0bsvn48602-53.1.noarch.rpm"
RPM_HASH = "a1ffd0f23c9782fc078eed70a6854cf6b13ddffd997719425ed01253f9d598cb91fc77087070b2572585d53cf820b35bcb4dac270e4b648a60af9b21d165810c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uri-doc"
RDEPENDS:${PN} += ""

inherit rpm
