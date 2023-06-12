SUMMARY = "Documentation for texlive-makerobust"
DESCRIPTION = "This package includes the documentation for texlive-makerobust"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn52811"

RPM_NAME = "texlive-makerobust-doc-2023.201.2.0svn52811-52.1.noarch.rpm"
RPM_HASH = "5ac385b68aced1902f256d63846c02ac367a3b10ab1613fb9bf8351b000921f7f6b9eeda9b0b813d5a60bf5330c7ad7537123ce0df65665473e04d70c6c3a6f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-makerobust-doc:en) \
texlive-makerobust-doc"
RDEPENDS:${PN} += ""

inherit rpm
