SUMMARY = "Documentation for texlive-termsim"
DESCRIPTION = "This package includes the documentation for texlive-termsim"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.1svn61414"

RPM_NAME = "texlive-termsim-doc-2023.201.1.1.1svn61414-54.1.noarch.rpm"
RPM_HASH = "888cc3e8535e127fc2dd4f58abbbb17de1c2b5c795c59ec3f9fa6207fcf5d4d4247f27198c12df643e1ef637c8499cda9d352cae4f8e5006d45184ab503a1166"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-termsim-doc:zh) \
texlive-termsim-doc"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
