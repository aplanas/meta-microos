SUMMARY = "RADOS block device headers"
DESCRIPTION = "This package contains libraries and headers needed to develop programs \
that use RADOS block device."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "librbd-devel-16.2.11.65+g8b7e6fc0182-1.1.aarch64.rpm"
RPM_HASH = "066ed19ab5d71e26f90c2a8ab4723332e4327cd886136affc6969f1fc08286845def4c17e159e7ccf669afa34e663895ef17c2e10b2d1becd983f41247264a9c"

RPROVIDES:${PN} += "librbd-devel librbd-devel(aarch-64) librbd1-devel"
RDEPENDS:${PN} += "librados-devel libradospp-devel librbd1"

inherit rpm
