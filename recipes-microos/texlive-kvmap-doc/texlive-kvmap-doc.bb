SUMMARY = "Documentation for texlive-kvmap"
DESCRIPTION = "This package includes the documentation for texlive-kvmap"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.5svn56361"

RPM_NAME = "texlive-kvmap-doc-2023.201.0.0.3.5svn56361-55.1.noarch.rpm"
RPM_HASH = "aeedddb8546b0365839fa3b14a508d0d8f9ffe9a55bb88c8dd26ccdbadb4921b83e3a2b36d51ff43321fde8368ca601d8e6f0622c833639005a3f8bb35f3cc16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kvmap-doc"
RDEPENDS:${PN} += ""

inherit rpm
