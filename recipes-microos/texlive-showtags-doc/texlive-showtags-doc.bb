SUMMARY = "Documentation for texlive-showtags"
DESCRIPTION = "This package includes the documentation for texlive-showtags"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.05svn20336"

RPM_NAME = "texlive-showtags-doc-2023.201.1.05svn20336-53.1.noarch.rpm"
RPM_HASH = "1bce0f69d23a7eba80d714516c79a51772e18fa98e5944096052f86ee07151db049b6d394e0ded9bd58f13ac74756796a77686786bdc8aff7796dd9e422072d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-showtags-doc"
RDEPENDS:${PN} += ""

inherit rpm
