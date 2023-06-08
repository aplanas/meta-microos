SUMMARY = "Documentation for texlive-gatherenum"
DESCRIPTION = "This package includes the documentation for texlive-gatherenum"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.8svn52209"

RPM_NAME = "texlive-gatherenum-doc-2023.201.1.8svn52209-52.1.noarch.rpm"
RPM_HASH = "718177386bb291de156d4c2e4de514299529928ae8f531af11be8e0535f8d16718305b311d6717050f442796c9f0e5f6473789f4e2c6c55f7aebdf61a6cbc7ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gatherenum-doc"
RDEPENDS:${PN} += ""

inherit rpm
