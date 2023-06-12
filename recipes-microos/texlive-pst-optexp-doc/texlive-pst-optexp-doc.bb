SUMMARY = "Documentation for texlive-pst-optexp"
DESCRIPTION = "This package includes the documentation for texlive-pst-optexp"
LICENSE = "LPPL-1.0"

PV = "2023.201.6.1svn62977"

RPM_NAME = "texlive-pst-optexp-doc-2023.201.6.1svn62977-52.1.noarch.rpm"
RPM_HASH = "db7223a4cf71fe4267471c0cabd1f771da605ffe7f14bca34df6cc507c2fd26230f76f07d9b84cbc9fafe4a6091c9033a65416c2e2bac6fae317bddfaa1521f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pst-optexp-doc:de;en) \
texlive-pst-optexp-doc"
RDEPENDS:${PN} += ""

inherit rpm
