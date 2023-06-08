SUMMARY = "Development files for libcollection"
DESCRIPTION = "A data-type to collect data in a hierarchical structure for easy iteration \
and serialization"
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.0"

RPM_NAME = "libcollection-devel-0.7.0-27.18.aarch64.rpm"
RPM_HASH = "44a42d7dcdb7a526c1efa1c241ac68f744ee44c8df556e90238ae4c23467b0aeb4848309185ca192d5d423b3f46c962726be7273ed697e3366d04933bdefa233"

RPROVIDES:${PN} += "libcollection-devel libcollection-devel(aarch-64) pkgconfig(collection)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcollection4"

inherit rpm
