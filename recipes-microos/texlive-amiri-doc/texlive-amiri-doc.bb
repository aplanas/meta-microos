SUMMARY = "Documentation for texlive-amiri"
DESCRIPTION = "This package includes the documentation for texlive-amiri"
LICENSE = "OFL-1.1"

PV = "2023.201.1.000svn65191"

RPM_NAME = "texlive-amiri-doc-2023.201.1.000svn65191-54.1.noarch.rpm"
RPM_HASH = "8551c3126ced0540a90a5a58800cce7d321c497dfbd16f195525f38f5a4fd5c928e1f24cc806ca6c704c2022e5e3d77c2a399c4aecb76225ddf1be56a9e8a25b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-amiri-doc:ar) texlive-amiri-doc"
RDEPENDS:${PN} += ""

inherit rpm
