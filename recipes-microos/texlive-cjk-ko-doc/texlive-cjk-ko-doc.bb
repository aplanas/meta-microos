SUMMARY = "Documentation for texlive-cjk-ko"
DESCRIPTION = "This package includes the documentation for texlive-cjk-ko"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.3svn63561"

RPM_NAME = "texlive-cjk-ko-doc-2023.201.2.3svn63561-53.1.noarch.rpm"
RPM_HASH = "1b3a89c12988e9c6df0fb280be2ae63060d1c4646fa04939dd3b263c4d3df29b249687ab6ceed50c776a78eae5735c722daaeff4fdd89e1f846e8fe00acd7c89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-cjk-ko-doc:ko) \
texlive-cjk-ko-doc"
RDEPENDS:${PN} += ""

inherit rpm
