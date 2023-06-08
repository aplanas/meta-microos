SUMMARY = "Development Environment for the kyotocabinet Library"
DESCRIPTION = "This package contains the development environment (headers, shared \
library symlink, pkg-config file, ...) for libkyotocabinet16"
LICENSE = "SUSE-GPL-3.0-with-FLOSS-exception"

PV = "1.2.77"

RPM_NAME = "libkyotocabinet-devel-1.2.77-2.10.aarch64.rpm"
RPM_HASH = "fb1d31990f325f5bdfea578a9815e430e5ef0c6653bacd54e0be0fc6655038ecbe0d2b85dcbdbf20f2437e13190c87fe4b7708b664c50adf63dd75305b168067"

RPROVIDES:${PN} += "libkyotocabinet-devel libkyotocabinet-devel(aarch-64) libkyotocabinet16-devel pkgconfig(kyotocabinet)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libkyotocabinet16"

inherit rpm
