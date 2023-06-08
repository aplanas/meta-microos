SUMMARY = "Documentation for texlive-uni-wtal-ger"
DESCRIPTION = "This package includes the documentation for texlive-uni-wtal-ger"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn31541"

RPM_NAME = "texlive-uni-wtal-ger-doc-2023.201.0.0.2svn31541-53.1.noarch.rpm"
RPM_HASH = "882a5aca3bbb466d0479c60bca12d9b094e1d5e4c6da9cfb2754ed896de6962c37a2b32b1e3de5d351573845d15c5a36ee2cc7cf8d06151752dae4e750db9693"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-uni-wtal-ger-doc:de;en) texlive-uni-wtal-ger-doc"
RDEPENDS:${PN} += ""

inherit rpm
