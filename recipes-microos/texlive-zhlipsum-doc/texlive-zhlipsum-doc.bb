SUMMARY = "Documentation for texlive-zhlipsum"
DESCRIPTION = "This package includes the documentation for texlive-zhlipsum"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.0svn54994"

RPM_NAME = "texlive-zhlipsum-doc-2023.201.1.2.0svn54994-52.1.noarch.rpm"
RPM_HASH = "29cf15694a73886c3ca61b40ddef3fefbeea5f96bdffec867fbd772ea83074a212aff4eb47ba04e6e32d10ed44b319a91fd476e5bb77d331bb2fabf82a85cd1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-zhlipsum-doc:en;zh) texlive-zhlipsum-doc"
RDEPENDS:${PN} += ""

inherit rpm
