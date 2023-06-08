SUMMARY = "Documentation for texlive-amsrefs"
DESCRIPTION = "This package includes the documentation for texlive-amsrefs"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.14svn61937"

RPM_NAME = "texlive-amsrefs-doc-2023.201.2.14svn61937-54.1.noarch.rpm"
RPM_HASH = "1279c145e549da04ebb987308fc5c190bc41abe631323292d6909a129ee19655615ec65e6d99f3f3df3a8da6c4f4a422cdc08e8f7910235a10945ec288516534"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amsrefs-doc"
RDEPENDS:${PN} += ""

inherit rpm
