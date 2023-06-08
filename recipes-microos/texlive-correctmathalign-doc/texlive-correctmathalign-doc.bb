SUMMARY = "Documentation for texlive-correctmathalign"
DESCRIPTION = "This package includes the documentation for texlive-correctmathalign"
LICENSE = "BSD-3-Clause"

PV = "2023.204.1.1svn44131"

RPM_NAME = "texlive-correctmathalign-doc-2023.204.1.1svn44131-54.1.noarch.rpm"
RPM_HASH = "8fd6c60b7648f4f5108a36011a31ad219697faa549c53ad9051813ac6890cabad17e0f7953c4d121533731965b4eafe7838662d7bf2c562d9fbbc6cfc55e2abb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-correctmathalign-doc"
RDEPENDS:${PN} += ""

inherit rpm
