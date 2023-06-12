SUMMARY = "Documentation for texlive-platex-tools"
DESCRIPTION = "This package includes the documentation for texlive-platex-tools"
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn66185"

RPM_NAME = "texlive-platex-tools-doc-2023.201.svn66185-52.1.noarch.rpm"
RPM_HASH = "b7e785774ed698d5298bdcf195a7ba0e17b1718da06c8bda844fd8ebf8799d19445d0bda24bf37d59ba7a6c8653f2f20e3de1d6179ce1027e450e63bbfd32e7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-platex-tools-doc:ja) \
texlive-platex-tools-doc"
RDEPENDS:${PN} += ""

inherit rpm
