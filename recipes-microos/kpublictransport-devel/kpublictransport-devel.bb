SUMMARY = "Library for querying public transport data"
DESCRIPTION = "A library for access realtime public transport data and for performing public \
ransport journey queries.Development files."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kpublictransport-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "13aa200d851c3b3cfdd4a6f2da14cba90185084958b0ab44fe30d628fc106d60a1e5e7bcc05d78ab457e0d89603b9540376df4f55aa004115603c11e76ead2ef"

RPROVIDES:${PN} += "cmake(KPublicTransport) kpublictransport-devel kpublictransport-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Gui) extra-cmake-modules libKPublicTransport1 libKPublicTransportOnboard1 pkgconfig(zlib)"

inherit rpm
