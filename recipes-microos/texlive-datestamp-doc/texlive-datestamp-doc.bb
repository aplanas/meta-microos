SUMMARY = "Documentation for texlive-datestamp"
DESCRIPTION = "This package includes the documentation for texlive-datestamp"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.0.0.3svn61719"

RPM_NAME = "texlive-datestamp-doc-2023.204.0.0.3svn61719-54.1.noarch.rpm"
RPM_HASH = "aa374f61d5e94b302817f8e306eda4461454e0791240b2ebcb38287e086e6d307f19b550b39ba5d44657b20b43a840ef0492ac73a3f206c6368b96e7dcaa4ed9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datestamp-doc"
RDEPENDS:${PN} += ""

inherit rpm
