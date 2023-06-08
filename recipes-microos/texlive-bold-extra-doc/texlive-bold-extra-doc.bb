SUMMARY = "Documentation for texlive-bold-extra"
DESCRIPTION = "This package includes the documentation for texlive-bold-extra"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn17076"

RPM_NAME = "texlive-bold-extra-doc-2023.201.0.0.1svn17076-52.1.noarch.rpm"
RPM_HASH = "1abc1827a3e25991858e32315b21bf8c86dc81f7ea71b3c4635aac0d06eaf32bcd9d1245e32cd531a12ed4203b9e13946c0acb22a8e6e18b25c42a6ea621dd6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bold-extra-doc"
RDEPENDS:${PN} += ""

inherit rpm
