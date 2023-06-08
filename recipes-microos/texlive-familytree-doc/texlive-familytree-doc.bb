SUMMARY = "Documentation for texlive-familytree"
DESCRIPTION = "This package includes the documentation for texlive-familytree"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.1svn63739"

RPM_NAME = "texlive-familytree-doc-2023.201.3.1svn63739-52.1.noarch.rpm"
RPM_HASH = "7080aaf24e9faf853798ac385bfc9d13625124e5e89e588bcb43aa990bb4156cc7e60ea08bf0e3ea8657a1f1444b464db8d892cf26c5c3146ba723b3b06cd284"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-familytree-doc:ja) texlive-familytree-doc"
RDEPENDS:${PN} += ""

inherit rpm
