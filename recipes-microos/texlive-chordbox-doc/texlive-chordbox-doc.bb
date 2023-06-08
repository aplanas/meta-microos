SUMMARY = "Documentation for texlive-chordbox"
DESCRIPTION = "This package includes the documentation for texlive-chordbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn51000"

RPM_NAME = "texlive-chordbox-doc-2023.201.1.0svn51000-53.1.noarch.rpm"
RPM_HASH = "55f9f11bf9ba3246b592145f50c13a1319df2f58d6e0311821e29ec98e3c62c1cd0b6ad5600ce65e9ca1fe43bae86c61e7c1fb817a6887757e3366fd2f983791"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chordbox-doc"
RDEPENDS:${PN} += ""

inherit rpm
