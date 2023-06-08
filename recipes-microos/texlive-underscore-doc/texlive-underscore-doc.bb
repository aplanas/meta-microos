SUMMARY = "Documentation for texlive-underscore"
DESCRIPTION = "This package includes the documentation for texlive-underscore"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn18261"

RPM_NAME = "texlive-underscore-doc-2023.201.svn18261-53.1.noarch.rpm"
RPM_HASH = "faf30ddf32d1380632ab4329ea8ace37e03921fdc84f3afe7329575bcf84dbe7abe7b09088995563881f5235e52934c65b663418ef8bcd0ec2f9d9d48041e20c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-underscore-doc"
RDEPENDS:${PN} += ""

inherit rpm
