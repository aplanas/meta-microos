SUMMARY = "Documentation for texlive-ryersonsgsthesis"
DESCRIPTION = "This package includes the documentation for texlive-ryersonsgsthesis"
LICENSE = "Apache-1.0"

PV = "2023.201.1.0.3svn50119"

RPM_NAME = "texlive-ryersonsgsthesis-doc-2023.201.1.0.3svn50119-53.1.noarch.rpm"
RPM_HASH = "83beb16d374cbb438dbae1248336573322c0adacd559409adb81859f49bab6386b2f566dd1c17b3850fe2a83ac03c27a226df63fa23b6244b6dfeebe79be5261"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ryersonsgsthesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
