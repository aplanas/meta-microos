SUMMARY = "Documentation for texlive-cc-pl"
DESCRIPTION = "This package includes the documentation for texlive-cc-pl"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.02.3svn58602"

RPM_NAME = "texlive-cc-pl-doc-2023.201.1.02.3svn58602-52.1.noarch.rpm"
RPM_HASH = "5632fae982a0277f18c346e20cc676a70f1345223c900bebe5e15481cdb0f1c48236c52615a6385e420dca40714aa66f56b466f950f792e22fd2ed7ebacc3a56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cc-pl-doc"
RDEPENDS:${PN} += ""

inherit rpm
