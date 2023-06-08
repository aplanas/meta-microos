SUMMARY = "Documentation for texlive-stringenc"
DESCRIPTION = "This package includes the documentation for texlive-stringenc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.12svn52982"

RPM_NAME = "texlive-stringenc-doc-2023.201.1.12svn52982-57.1.noarch.rpm"
RPM_HASH = "e04fddf997a0feb0abf1093966d5628f133c3db60313ea27349e16c94a38bfb39f618758d471c76130875574af9ab08d127542364f091f603e90684526be1354"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stringenc-doc"
RDEPENDS:${PN} += ""

inherit rpm
