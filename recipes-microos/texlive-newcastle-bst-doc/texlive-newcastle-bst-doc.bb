SUMMARY = "Documentation for texlive-newcastle-bst"
DESCRIPTION = "This package includes the documentation for texlive-newcastle-bst"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn62856"

RPM_NAME = "texlive-newcastle-bst-doc-2023.201.1.1svn62856-54.1.noarch.rpm"
RPM_HASH = "7defac236d226cd6537df2a23d858f62c8573232c30882d6b3ed0b2edf774b3168edc2b7003ff99a71428191c3f1b772d7bf44d3df69201c569ceaf70492b004"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newcastle-bst-doc"
RDEPENDS:${PN} += ""

inherit rpm
