SUMMARY = "Documentation for texlive-productbox"
DESCRIPTION = "This package includes the documentation for texlive-productbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn20886"

RPM_NAME = "texlive-productbox-doc-2023.201.1.1svn20886-52.1.noarch.rpm"
RPM_HASH = "9c97a00fac575797be82145e94696ad6777c9392d929e773c4c163686e5704bf316a041ccfbf3a227fad77c50a7a097a1c35c012b53734d19355dec80e6fc975"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-productbox-doc"
RDEPENDS:${PN} += ""

inherit rpm
