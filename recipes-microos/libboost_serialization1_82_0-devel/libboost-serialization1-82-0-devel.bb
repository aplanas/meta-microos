SUMMARY = "Development headers for Boost.Serialization library"
DESCRIPTION = "This package contains development headers for Boost.Serialization \
library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_serialization1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "099f3012e8e076accfacf3f53e37fd327bd6ca2c9218c50f2065ce9dc61583904ce253b10f3555258c55367112862f55434bbf3647347e0860d173267dfb582d"

RPROVIDES:${PN} += "libboost_serialization-devel-impl libboost_serialization1_82_0-devel libboost_serialization1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_headers1_82_0-devel libboost_serialization1_82_0"

inherit rpm
