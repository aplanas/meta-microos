SUMMARY = "Documentation for texlive-scrabble"
DESCRIPTION = "This package includes the documentation for texlive-scrabble"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.3svn65507"

RPM_NAME = "texlive-scrabble-doc-2023.201.0.0.1.3svn65507-53.1.noarch.rpm"
RPM_HASH = "bbae0d2ff9413e2215f6c8e925e544bf1eebd34dd20ceabf7614e8a508793190205071e1b94d7f4b9a4063f7a9104befc5191174aebfa4af0745b41e69da8d1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-scrabble-doc:fr) texlive-scrabble-doc"
RDEPENDS:${PN} += ""

inherit rpm
