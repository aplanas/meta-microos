SUMMARY = "General-purpose scalable concurrent malloc implementation"
DESCRIPTION = "jemalloc is a general-purpose scalable concurrent malloc(3) implementation. \
This package provides a shell wrapper script to run programs using jemalloc."
LICENSE = "BSD-2-Clause"

PV = "5.3.0"

RPM_NAME = "jemalloc-5.3.0-1.6.aarch64.rpm"
RPM_HASH = "df0251e4117412dfd747c169d344f021ee459219b2ad44ab3a33e271f42d220025e7739b2f4971d669a9c0310e39000db61e9948ee98a6016a42a351110f1c61"

RPROVIDES:${PN} += "jemalloc jemalloc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env libjemalloc2"

inherit rpm
