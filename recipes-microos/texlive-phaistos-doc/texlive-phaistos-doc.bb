SUMMARY = "Documentation for texlive-phaistos"
DESCRIPTION = "This package includes the documentation for texlive-phaistos"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn18651"

RPM_NAME = "texlive-phaistos-doc-2023.201.1.0svn18651-51.1.noarch.rpm"
RPM_HASH = "64013059026c670d2d25827baa6d901c9947ae67d885a26903d8cd9387de32b386f3246c0a6bb4b5e09676c08ab73895fc6b9bb7718a2b43eada643b0a041354"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phaistos-doc"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
