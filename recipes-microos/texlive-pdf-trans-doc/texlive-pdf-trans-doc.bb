SUMMARY = "Documentation for texlive-pdf-trans"
DESCRIPTION = "This package includes the documentation for texlive-pdf-trans"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.4svn32809"

RPM_NAME = "texlive-pdf-trans-doc-2023.201.2.4svn32809-51.1.noarch.rpm"
RPM_HASH = "b38a5ecec063254cea2b4ed5a28ceba76c6ae1daea4ebaaa2c07231e26219b325c41ef038dbb14c1fcc0f002cb79e409cd27e28294c5584ce60c9805e6e79238"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdf-trans-doc"
RDEPENDS:${PN} += ""

inherit rpm
