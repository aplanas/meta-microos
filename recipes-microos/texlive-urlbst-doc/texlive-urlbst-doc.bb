SUMMARY = "Documentation for texlive-urlbst"
DESCRIPTION = "This package includes the documentation for texlive-urlbst"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.9.1svn65694"

RPM_NAME = "texlive-urlbst-doc-2023.201.0.0.9.1svn65694-53.1.noarch.rpm"
RPM_HASH = "300f4b478a6c8aa58dedb03190872898ea4c2f0566ac65a32ac6ec70541efc604c96be69760bf498ecbd9f99fcfec6b91f4cd662663ad299e2dc1c5c546e93ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-urlbst-doc"
RDEPENDS:${PN} += ""

inherit rpm
