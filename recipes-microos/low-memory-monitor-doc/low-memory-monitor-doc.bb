SUMMARY = "Documentation for low-memory-monitor"
DESCRIPTION = "This package provides documentation for low-memory-monitor."
LICENSE = "GPL-3.0-only"

PV = "2.1"

RPM_NAME = "low-memory-monitor-doc-2.1-3.8.aarch64.rpm"
RPM_HASH = "86e37de7d60890a27277268a21c3c87a6d0cc2a7195f49ad205b83a9c0597ac68d06c252ce182a6985552da292c003c04b0a68535ce2f92034dba50e29609aff"

RPROVIDES:${PN} += "low-memory-monitor-doc low-memory-monitor-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
