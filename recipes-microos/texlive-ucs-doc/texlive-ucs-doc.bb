SUMMARY = "Documentation for texlive-ucs"
DESCRIPTION = "This package includes the documentation for texlive-ucs"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn64114"

RPM_NAME = "texlive-ucs-doc-2023.201.2.3svn64114-53.1.noarch.rpm"
RPM_HASH = "7f5aec024f74e755221c54db5d88ea5730254326846b621ead684a2e1140e5e96f2598dffd0841a48b3076c37572d478210cf34004c0417a6ee442f9e49b8509"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ucs-doc"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
