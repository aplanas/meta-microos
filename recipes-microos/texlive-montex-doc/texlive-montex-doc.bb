SUMMARY = "Documentation for texlive-montex"
DESCRIPTION = "This package includes the documentation for texlive-montex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.ivu.04.092svn29349"

RPM_NAME = "texlive-montex-doc-2023.201.ivu.04.092svn29349-54.1.noarch.rpm"
RPM_HASH = "f2346fbd9a385e43e3ccb7652010eeb081c59faff3ba977bc22fd481b6015694c4fb9ebfe719b3371a1ac45165289298f73a7c8f031e62d346f74eb1e8fe6a0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-montex-doc"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl"

inherit rpm
