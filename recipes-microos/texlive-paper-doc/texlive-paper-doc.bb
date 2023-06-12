SUMMARY = "Documentation for texlive-paper"
DESCRIPTION = "This package includes the documentation for texlive-paper"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0lsvn34521"

RPM_NAME = "texlive-paper-doc-2023.201.1.0lsvn34521-51.1.noarch.rpm"
RPM_HASH = "a0e7a0a97158133ba9a58e4e3dc3859f50dc39e39f158846dc42cdcca042d797739c66a804656a685f2383bff98155e6c22d0f1260657df0d9fdabb249b78a0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-paper-doc:de) \
texlive-paper-doc"
RDEPENDS:${PN} += ""

inherit rpm
