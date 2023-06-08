SUMMARY = "Documentation for texlive-esk"
DESCRIPTION = "This package includes the documentation for texlive-esk"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn18115"

RPM_NAME = "texlive-esk-doc-2023.201.1.0svn18115-53.1.noarch.rpm"
RPM_HASH = "69dc2a98d0c2844eb9f405ad17879cc8283c839692ad0b8c91f7b67624c661fcaa3235f5c41c8174f7bdcc80898b1793f4d29ea056b67a45ae2a6075056e2ac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esk-doc"
RDEPENDS:${PN} += ""

inherit rpm
