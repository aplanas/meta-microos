SUMMARY = "Documentation for texlive-quiz2socrative"
DESCRIPTION = "This package includes the documentation for texlive-quiz2socrative"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn52276"

RPM_NAME = "texlive-quiz2socrative-doc-2023.201.1.0svn52276-53.1.noarch.rpm"
RPM_HASH = "de9c02eee036b0dddbc81fb83ab46ea45d94aee40706c44f85731b7b16ea9e2e6015d6498b18dcde35f81943bf3a02b8411e7ce5e6dfe51303dc14271352e08b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-quiz2socrative-doc:it) texlive-quiz2socrative-doc"
RDEPENDS:${PN} += ""

inherit rpm
