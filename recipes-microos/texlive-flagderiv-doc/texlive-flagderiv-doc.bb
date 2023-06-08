SUMMARY = "Documentation for texlive-flagderiv"
DESCRIPTION = "This package includes the documentation for texlive-flagderiv"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.10svn15878"

RPM_NAME = "texlive-flagderiv-doc-2023.201.0.0.10svn15878-52.1.noarch.rpm"
RPM_HASH = "085fd300f8dd4b06437a85c4113ae685d12af6518110709d8ec9cb8be9cc7f517b3e0891805a17a3adbb63eef1bdd6739e488aa8f23c7aa77535f1381a71f38b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flagderiv-doc"
RDEPENDS:${PN} += ""

inherit rpm
