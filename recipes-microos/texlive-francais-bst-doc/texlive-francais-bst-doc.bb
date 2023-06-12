SUMMARY = "Documentation for texlive-francais-bst"
DESCRIPTION = "This package includes the documentation for texlive-francais-bst"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn38922"

RPM_NAME = "texlive-francais-bst-doc-2023.201.1.1svn38922-52.1.noarch.rpm"
RPM_HASH = "c769fbcf3b87bf2439a374e34e55503b7d5d6c918ba05292f69adbe4915b28be584db85e6af2cd8e23a6d21e9fee5ce2fda4cf3b634bcca184e1032fd3c9f30d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-francais-bst-doc:fr) \
texlive-francais-bst-doc"
RDEPENDS:${PN} += ""

inherit rpm
