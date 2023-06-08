SUMMARY = "A client for the network fax server HylaFAX 4.x under Microsoft Windows(r)"
DESCRIPTION = "WHFC is a client for the network fax server HylaFAX 4.x under Microsoft \
Windows(r) 95/98 and NT/2000. \
 \
Authors: \
-------- \
    Ulrich Eckhardt <whfc at gmx de>"
LICENSE = "GPL-2.0+"

PV = "1.2.3"

RPM_NAME = "whfc-1.2.3-177.14.noarch.rpm"
RPM_HASH = "4ef1f4d0ee1e9c500417134569c8a26b89fb68dc5022ae0c9740cc314451dd37546a5b59d3aa0286f5e5d9124e01988a3fa65ccb8dd862da25fd85f036c92b94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "whfc"
RDEPENDS:${PN} += ""

inherit rpm
