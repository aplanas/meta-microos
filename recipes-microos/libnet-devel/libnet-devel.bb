SUMMARY = "Devel files for libnet"
DESCRIPTION = "Libnet is an API to help with the construction and handling of network \
packets. This package contains devel files."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "libnet-devel-1.2-3.8.aarch64.rpm"
RPM_HASH = "832e4ea4310ae55c1cc0bd0e8b0eba9539b7dcc02cdd025285da4bc35612e4cd19d79cdeafc381278f721540e5de6b9c76590e7103c12e72b405dae114f8f95d"

RPROVIDES:${PN} += "libnet-devel libnet-devel(aarch-64) pkgconfig(libnet)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config libnet9"

inherit rpm
