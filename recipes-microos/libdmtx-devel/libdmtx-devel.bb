SUMMARY = "Software for reading and writing Data Matrix barcodes"
DESCRIPTION = "libdmtx is open source software for reading and writing Data Matrix barcodes. \
At its core libdmtx is a native shared library, allowing C/C++ programs to use \
its capabilities without extra restrictions or overhead."
LICENSE = "BSD-2-Clause"

PV = "0.7.7"

RPM_NAME = "libdmtx-devel-0.7.7-1.4.aarch64.rpm"
RPM_HASH = "7778fd73728a9be38f01fb4d2897674041a7479d4f6e510435db4aa3cdc9f778f8653b38d03f983aa9e97bb6126549bde5772d93e7108862f582ba3f54514796"

RPROVIDES:${PN} += "libdmtx-devel libdmtx-devel(aarch-64) pkgconfig(libdmtx)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libdmtx0"

inherit rpm
