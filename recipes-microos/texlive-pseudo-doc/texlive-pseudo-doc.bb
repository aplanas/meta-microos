SUMMARY = "Documentation for texlive-pseudo"
DESCRIPTION = "This package includes the documentation for texlive-pseudo"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.2svn65690"

RPM_NAME = "texlive-pseudo-doc-2023.201.1.2.2svn65690-52.1.noarch.rpm"
RPM_HASH = "6bea01ddba29926c4d9ecdb9077c0cedf2e7ecb746a6995d7d5d729df99cbdfbaec052c3cef90ee2966d6fe47fc6833d8f9725e8eeb450a338908eb32facd9b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pseudo-doc"
RDEPENDS:${PN} += ""

inherit rpm
