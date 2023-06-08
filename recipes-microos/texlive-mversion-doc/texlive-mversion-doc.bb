SUMMARY = "Documentation for texlive-mversion"
DESCRIPTION = "This package includes the documentation for texlive-mversion"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn29370"

RPM_NAME = "texlive-mversion-doc-2023.201.1.0.1svn29370-54.1.noarch.rpm"
RPM_HASH = "e33acb29fffbe8e24d795906e0b4785cd1720f57bcd0f51f7e888a1cdc888bd3af703bb0f86f0cc6826883798f8bfe1dd74fa180dc65a718a18c9e1dba076a4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mversion-doc"
RDEPENDS:${PN} += ""

inherit rpm
