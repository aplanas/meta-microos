SUMMARY = "Documentation for texlive-alertmessage"
DESCRIPTION = "This package includes the documentation for texlive-alertmessage"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn38055"

RPM_NAME = "texlive-alertmessage-doc-2023.201.1.1svn38055-54.1.noarch.rpm"
RPM_HASH = "c30c2577842ba3264f5080bb6f01e9aa98cba2ec0ee6ff84bb42587b72bfeeccb7489b9d4d5ea467fd76c05fce8f0e29baa96fff1610bf686aa9247d5b600292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alertmessage-doc"
RDEPENDS:${PN} += ""

inherit rpm
