SUMMARY = "Documentation for texlive-js-misc"
DESCRIPTION = "This package includes the documentation for texlive-js-misc"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn16211"

RPM_NAME = "texlive-js-misc-doc-2023.201.svn16211-55.1.noarch.rpm"
RPM_HASH = "0577f7e834d297e4d8919c3a295f02c9a3b0333721d5fd694e79062ba37bac348ecf98cf0470207182b43836e69b6417d233cf40e6f835e2bd6b33c69195df13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-js-misc-doc"
RDEPENDS:${PN} += ""

inherit rpm
