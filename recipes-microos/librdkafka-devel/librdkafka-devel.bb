SUMMARY = "Development files for the Kafka C/C++ library"
DESCRIPTION = "librdkafka is a C library implementation of the Apache Kafka protocol, \
containing both Producer and Consumer support. \
 \
This package contains development headers and examples."
LICENSE = "BSD-2-Clause"

PV = "2.1.0"

RPM_NAME = "librdkafka-devel-2.1.0-1.1.aarch64.rpm"
RPM_HASH = "c13b07b0df739b3f30180b1d563ec913cd7b114570880e78c5b354c451b5aa11cc415522fff5b230dadcf06c52dc462d02f39a795b9ce898a1320899073834f1"

RPROVIDES:${PN} += "librdkafka-devel librdkafka-devel(aarch-64) pkgconfig(rdkafka) pkgconfig(rdkafka++) pkgconfig(rdkafka++-static) pkgconfig(rdkafka-static)"
RDEPENDS:${PN} += "/usr/bin/pkg-config librdkafka1 pkgconfig(libcrypto) pkgconfig(libcurl) pkgconfig(liblz4) pkgconfig(libsasl2) pkgconfig(libssl) pkgconfig(libzstd) pkgconfig(rdkafka) pkgconfig(rdkafka-static) pkgconfig(zlib)"

inherit rpm
