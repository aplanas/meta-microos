SUMMARY = "Documentation for texlive-context-vim"
DESCRIPTION = "This package includes the documentation for texlive-context-vim"
LICENSE = "BSD-3-Clause"

PV = "2023.204.svn62071"

RPM_NAME = "texlive-context-vim-doc-2023.204.svn62071-54.1.noarch.rpm"
RPM_HASH = "f71cca8309733f0c6696fbffe5ff246408d7ec5c8ac05856b60fefe012482cd0e7d3299c95352e753a0babca9ada84b4692b4198f9905bb4b0e0e326ce3b57a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-vim-doc"
RDEPENDS:${PN} += ""

inherit rpm
