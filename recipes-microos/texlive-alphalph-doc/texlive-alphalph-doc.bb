SUMMARY = "Documentation for texlive-alphalph"
DESCRIPTION = "This package includes the documentation for texlive-alphalph"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.6svn53087"

RPM_NAME = "texlive-alphalph-doc-2023.201.2.6svn53087-54.1.noarch.rpm"
RPM_HASH = "22c66e2c61c371f5ce32a6925b03d4f74c95fd48358b04d12414409424e32888fe814a00264143822f1dd8a0470376a25d1caa3dfb21782304ccba85a5c97bfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alphalph-doc"
RDEPENDS:${PN} += ""

inherit rpm
