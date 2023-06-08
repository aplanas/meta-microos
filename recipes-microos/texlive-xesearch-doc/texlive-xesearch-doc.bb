SUMMARY = "Documentation for texlive-xesearch"
DESCRIPTION = "This package includes the documentation for texlive-xesearch"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn51908"

RPM_NAME = "texlive-xesearch-doc-2023.201.0.0.2svn51908-52.1.noarch.rpm"
RPM_HASH = "f43e511e5992df360b50da47ae01fbf21d2483d4b895cbd2bb528f5e763d7cbffc25c29f75ca744fb7daac06ae290f098b7dfab8799928b3c35c7b95edd90a82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xesearch-doc"
RDEPENDS:${PN} += ""

inherit rpm
