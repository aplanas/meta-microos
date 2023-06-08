SUMMARY = "Documentation for texlive-etex"
DESCRIPTION = "This package includes the documentation for texlive-etex"
LICENSE = "SUSE-TeX"

PV = "2023.201.svn66203"

RPM_NAME = "texlive-etex-doc-2023.201.svn66203-52.1.noarch.rpm"
RPM_HASH = "919925736b5b3adb8ef6f30b275d5e5cac1e30982859c7b48889a5e1e8ffed281aeafad1688722def2be2f3b4d08c93beaacdccb4bbbc32d310453025fd59f0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(etex.1) texlive-etex-doc"
RDEPENDS:${PN} += ""

inherit rpm
