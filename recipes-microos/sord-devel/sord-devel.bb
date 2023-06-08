SUMMARY = "Development files for libsord"
DESCRIPTION = "Development files for libsord. \
Sord is a lightweight C library for storing RDF data in memory."
LICENSE = "ISC"

PV = "0.16.14"

RPM_NAME = "sord-devel-0.16.14-1.3.aarch64.rpm"
RPM_HASH = "09e677c1eea55daba35644939577b85b21308f0c0844cc077201700b7452a3bd0a60cf562304a0ac888780f3b2c8b38e1bd3568236360a4e0427dcac1dd15ffd"

RPROVIDES:${PN} += "libsord-0-devel pkgconfig(sord-0) sord-devel sord-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libsord-0-0 pkgconfig(serd-0)"

inherit rpm
