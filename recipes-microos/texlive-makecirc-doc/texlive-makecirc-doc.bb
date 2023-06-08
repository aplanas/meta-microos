SUMMARY = "Documentation for texlive-makecirc"
DESCRIPTION = "This package includes the documentation for texlive-makecirc"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-makecirc-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "0eb9a5ce9621b0b8d4447b307ff4e9ce1d2fb64036980d82c1fbdbd81734a83f56617e849267ef61f0fada6d43bb8846e6fccf63aa78cc388a8076954af660f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-makecirc-doc:en;es) texlive-makecirc-doc"
RDEPENDS:${PN} += ""

inherit rpm
