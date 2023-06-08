SUMMARY = "Documentation for texlive-simplewick"
DESCRIPTION = "This package includes the documentation for texlive-simplewick"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.2asvn15878"

RPM_NAME = "texlive-simplewick-doc-2023.201.1.2asvn15878-53.1.noarch.rpm"
RPM_HASH = "9a19b417e78c62046e892d38e4b952b25fa90aae03a9c244e09efcff0324b577f96f4e9352ab9924c461e6f5aaec472a10d098c42baa208b1d4f358380ece61f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simplewick-doc"
RDEPENDS:${PN} += ""

inherit rpm
