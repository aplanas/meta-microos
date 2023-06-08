SUMMARY = "Documentation for texlive-erw-l3"
DESCRIPTION = "This package includes the documentation for texlive-erw-l3"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2svn61799"

RPM_NAME = "texlive-erw-l3-doc-2023.201.4.2svn61799-53.1.noarch.rpm"
RPM_HASH = "53c280f2bc87c7ebda0ecfc9fa43589d1e1ac5dfad4d9b1964f3256d070a0591922c690df69dea5b6d9f5aceb9a88b75248c200544a802b0da17c65bb6b672ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-erw-l3-doc"
RDEPENDS:${PN} += ""

inherit rpm
