SUMMARY = "Documentation for texlive-mfware"
DESCRIPTION = "This package includes the documentation for texlive-mfware"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-mfware-doc-2023.201.svn66186-54.1.noarch.rpm"
RPM_HASH = "2386225d773a8ae57ebd55dddf95aa341c0c75de4fd9165464839366fd9e61b78e5842210ce93c18ab9bc01ee52d82f74fae5d3727a4287eec482585aaf8c683"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(gftodvi.1) \
man(gftopk.1) \
man(gftype.1) \
man(mft.1) \
man(pktogf.1) \
man(pktype.1) \
texlive-mfware-doc"
RDEPENDS:${PN} += ""

inherit rpm
