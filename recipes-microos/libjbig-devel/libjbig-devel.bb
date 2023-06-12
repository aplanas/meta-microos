SUMMARY = "JBIG1 lossless image compression library -- development files"
DESCRIPTION = "The libjbig-devel package contains files needed for development using \
the JBIG-KIT image compression library."
LICENSE = "GPL-2.0-or-later"

PV = "2.1"

RPM_NAME = "libjbig-devel-2.1-4.4.aarch64.rpm"
RPM_HASH = "d59d7de35b9e90685c322893083ce9005a7d9b72be8733c37b44f3487e3b1ae8a0800bfc9dfa6a188d0f5faf84fc6d62755fcae5f14c9d0afa04d86f196add20"

RPROVIDES:${PN} += "libjbig-devel \
libjbig-devel(aarch-64)"
RDEPENDS:${PN} += "libjbig2"

inherit rpm
