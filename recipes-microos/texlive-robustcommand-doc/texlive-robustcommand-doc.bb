SUMMARY = "Documentation for texlive-robustcommand"
DESCRIPTION = "This package includes the documentation for texlive-robustcommand"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-robustcommand-doc-2023.201.0.0.1svn15878-53.1.noarch.rpm"
RPM_HASH = "dcc4605ecfe39d3addb9a5b491fc191f9987f7878b1b5a8cc04fa916f5518db7cb964812d3792f5ac2771bde67a0ff53ef11e98000c8581b0024548f321d2c8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-robustcommand-doc:de) texlive-robustcommand-doc"
RDEPENDS:${PN} += ""

inherit rpm
