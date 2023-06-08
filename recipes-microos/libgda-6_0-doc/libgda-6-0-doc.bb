SUMMARY = "GNU Data Access (GDA) Library -- Developer Documentation"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-doc-6.0.0-6.6.aarch64.rpm"
RPM_HASH = "ec85ab4452a9603996f28c258976ba25af104659e48277c5cfd1bc7736b7311dfef54d84a50362529e8218c01f6e8bb62b887994583ec6a9a40e371c17566626"

RPROVIDES:${PN} += "libgda-6_0-doc libgda-6_0-doc(aarch-64) libgda-doc"
RDEPENDS:${PN} += ""

inherit rpm
