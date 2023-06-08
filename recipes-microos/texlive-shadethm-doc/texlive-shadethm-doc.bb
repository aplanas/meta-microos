SUMMARY = "Documentation for texlive-shadethm"
DESCRIPTION = "This package includes the documentation for texlive-shadethm"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn53350"

RPM_NAME = "texlive-shadethm-doc-2023.201.svn53350-53.1.noarch.rpm"
RPM_HASH = "b06f66260f26d3c3dbf9e882bb30cc0ccb5fe66833eeea5889c34892dfbfe79e99e25e33442a65b86debecbcd2250822b9e5bd34ced916cab7feb55950daab9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shadethm-doc"
RDEPENDS:${PN} += ""

inherit rpm
