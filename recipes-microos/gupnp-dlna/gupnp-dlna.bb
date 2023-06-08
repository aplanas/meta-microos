SUMMARY = "A collection of helpers for building DLNA applications"
DESCRIPTION = "GUPnP-DLNA is a collection of helpers for building DLNA media sharing \
applications using GUPnP."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "gupnp-dlna-0.12.0-1.10.aarch64.rpm"
RPM_HASH = "8ce2180d8032d39eaf68f52be867840a7915b72069347e34b256aaf06ec51af249e90324f65187e5c448cee4a1f8186099e8b78dc40ae60e86132503d01d6efd"

RPROVIDES:${PN} += "gupnp-dlna gupnp-dlna(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
