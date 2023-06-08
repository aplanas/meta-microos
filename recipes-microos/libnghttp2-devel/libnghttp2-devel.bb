SUMMARY = "Development files for nghttp2"
DESCRIPTION = "Development files for usage with libnghttp2, which implements \
Hypertext Transfer Protocol version 2."
LICENSE = "MIT"

PV = "1.52.0"

RPM_NAME = "libnghttp2-devel-1.52.0-1.1.aarch64.rpm"
RPM_HASH = "8be989023ad28e344f0fd4c1e99bef6fb964a2fceee4f9a237ef7570057252cf18fb3b59efa6307d85fbb46f6ecea0b37422c8ede2fb4929ebea66818b5dc7a3"

RPROVIDES:${PN} += "libnghttp2-devel libnghttp2-devel(aarch-64) nghttp2-devel pkgconfig(libnghttp2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libnghttp2-14"

inherit rpm
