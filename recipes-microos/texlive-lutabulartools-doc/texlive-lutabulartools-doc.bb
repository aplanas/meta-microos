SUMMARY = "Documentation for texlive-lutabulartools"
DESCRIPTION = "This package includes the documentation for texlive-lutabulartools"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65153"

RPM_NAME = "texlive-lutabulartools-doc-2023.201.svn65153-52.1.noarch.rpm"
RPM_HASH = "89d50a6eb66696ca861309d8baecd3d3dbf27f630daf5c56ec2aa89f87a6dfaa598f6fc09a304c74a208bef1d71ce6459467a3628bbd67612aa27ff9695c8b2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lutabulartools-doc"
RDEPENDS:${PN} += ""

inherit rpm
