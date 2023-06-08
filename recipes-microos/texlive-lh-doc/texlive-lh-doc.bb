SUMMARY = "Documentation for texlive-lh"
DESCRIPTION = "This package includes the documentation for texlive-lh"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.5gsvn15878"

RPM_NAME = "texlive-lh-doc-2023.201.3.5gsvn15878-54.1.noarch.rpm"
RPM_HASH = "91febc9252ec3a8008b1bb89d08f651ab7db9ec7391c7a8bb2ce3053d872050a0eed2b4496f1a879dd5e05bf1d0ab177e2b118677826fbc1d08a763b69c484ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lh-doc"
RDEPENDS:${PN} += ""

inherit rpm
