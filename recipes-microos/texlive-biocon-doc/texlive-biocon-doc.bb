SUMMARY = "Documentation for texlive-biocon"
DESCRIPTION = "This package includes the documentation for texlive-biocon"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-biocon-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "a411286d8fed7ef618fb37be6b21ab72aa4a9a58fbe326b6481abcb680cc396bcbab187909d491ab739060f55adacc3b1b5987b27d08f4985c74e7f4ff5a285a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biocon-doc"
RDEPENDS:${PN} += ""

inherit rpm
