SUMMARY = "RADOS block device headers"
DESCRIPTION = "This package contains libraries and headers needed to develop programs \
that use RADOS block device."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "librbd-devel-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "2d01da6b8a37f281a15359c435fd4fecbbba5b150b0e6f51af45fdf46dd6b2bfd7ca9c813cacd1ee240806aff1e2d8a5f17e4515694dd922200d88a028bfe2f2"

RPROVIDES:${PN} += "librbd-devel librbd-devel(aarch-64) librbd1-devel"
RDEPENDS:${PN} += "librados-devel libradospp-devel librbd1"

inherit rpm
