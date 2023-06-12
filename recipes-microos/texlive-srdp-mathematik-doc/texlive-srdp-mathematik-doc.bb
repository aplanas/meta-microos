SUMMARY = "Documentation for texlive-srdp-mathematik"
DESCRIPTION = "This package includes the documentation for texlive-srdp-mathematik"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.11.0svn65293"

RPM_NAME = "texlive-srdp-mathematik-doc-2023.201.1.11.0svn65293-57.1.noarch.rpm"
RPM_HASH = "24f62b8a342b244b94c0caabf79f6668c845c88f242037a6a37af1a2a8797da27054db2897be0cd18f6927a914df5eff40f38a05621cdc0fd73e9e34d98b66ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-srdp-mathematik-doc:de-at) \
texlive-srdp-mathematik-doc"
RDEPENDS:${PN} += ""

inherit rpm
