SUMMARY = "RADOS gateway client library"
DESCRIPTION = "This package contains libraries and headers needed to develop programs \
that use RADOS gateway client library."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "librgw-devel-16.2.11.65+g8b7e6fc0182-1.1.aarch64.rpm"
RPM_HASH = "452d2713660c05e4ce9c940f62fd55727aca8daf2175e66ced0d9c1d03dcccd93dceb83b73497d1eaa2f6531a6affb1825b1b042d18991c06ee54f37242aa409"

RPROVIDES:${PN} += "librgw-devel librgw-devel(aarch-64) librgw2-devel"
RDEPENDS:${PN} += "librados-devel librgw2"

inherit rpm
