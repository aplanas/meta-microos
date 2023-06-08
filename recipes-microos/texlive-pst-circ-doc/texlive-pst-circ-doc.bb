SUMMARY = "Documentation for texlive-pst-circ"
DESCRIPTION = "This package includes the documentation for texlive-pst-circ"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.19svn60464"

RPM_NAME = "texlive-pst-circ-doc-2023.201.2.19svn60464-52.1.noarch.rpm"
RPM_HASH = "ead0585f89626d967075118be67b4c04316a15931df6c3a4ff70065af450a29ae8399b8a06e3022539571449f45ab510544bc277fbb6de7e36548c2ecd75c808"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-circ-doc"
RDEPENDS:${PN} += ""

inherit rpm
