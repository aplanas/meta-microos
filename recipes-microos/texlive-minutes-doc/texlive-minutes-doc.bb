SUMMARY = "Documentation for texlive-minutes"
DESCRIPTION = "This package includes the documentation for texlive-minutes"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8fsvn42186"

RPM_NAME = "texlive-minutes-doc-2023.201.1.8fsvn42186-54.1.noarch.rpm"
RPM_HASH = "1d5487c02eb79f941da4be69bcdf6796c333b91549be61ef1bcc7d312d7c427fa2ba2f60df2e8af3228bb1bf19d7e0ee84869f2d8a2f2e96b29cf811a05b3587"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minutes-doc"
RDEPENDS:${PN} += ""

inherit rpm
