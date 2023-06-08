SUMMARY = "Documentation for texlive-plweb"
DESCRIPTION = "This package includes the documentation for texlive-plweb"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn15878"

RPM_NAME = "texlive-plweb-doc-2023.201.3.0svn15878-52.1.noarch.rpm"
RPM_HASH = "cd03833761222848f93b0d1ad1ad39461d1f8ccd1d40abf43fb64680d8e8e1cab37eb77492ab48bc4df6efa9447d6d01c1492c14a4058544cd4a373bdbca4c66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plweb-doc"
RDEPENDS:${PN} += ""

inherit rpm
