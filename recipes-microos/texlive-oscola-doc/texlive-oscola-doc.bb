SUMMARY = "Documentation for texlive-oscola"
DESCRIPTION = "This package includes the documentation for texlive-oscola"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn54328"

RPM_NAME = "texlive-oscola-doc-2023.201.1.7svn54328-54.1.noarch.rpm"
RPM_HASH = "4cb59f8d001e771028c8965c5b716e93ff50b18944497936cee6044884fa6bb107bd0acfaca512b682812c1ae0dc3a38c32c17f253a2eca06eceb76249df67b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oscola-doc"
RDEPENDS:${PN} += ""

inherit rpm
