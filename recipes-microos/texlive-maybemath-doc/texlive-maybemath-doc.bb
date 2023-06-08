SUMMARY = "Documentation for texlive-maybemath"
DESCRIPTION = "This package includes the documentation for texlive-maybemath"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-maybemath-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "d85ddd01111e18417d8c689607fab8c2ee58373dddacabe3068f0bbdd839c8d61c0ec3babed74321eccbebf3b052226d71d6fafaaf72613f8e8a484fb7f8213b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-maybemath-doc"
RDEPENDS:${PN} += ""

inherit rpm
