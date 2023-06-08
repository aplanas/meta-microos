SUMMARY = "Documentation for texlive-flipbook"
DESCRIPTION = "This package includes the documentation for texlive-flipbook"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn25584"

RPM_NAME = "texlive-flipbook-doc-2023.201.0.0.2svn25584-52.1.noarch.rpm"
RPM_HASH = "1faafbad8eb5d36bfcbf1a30c76107b2bef69a1ae0ec53d47ef54d7a8825e7d423e592d18ba61c47519ad3cccd4ec950eff7b12834d06876d79f1e8b964439f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flipbook-doc"
RDEPENDS:${PN} += ""

inherit rpm
