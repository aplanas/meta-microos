SUMMARY = "Static version of qrupdate library"
DESCRIPTION = "This package contains the static version of the qrupdate libraries."
LICENSE = "GPL-3.0+"

PV = "1.1.2"

RPM_NAME = "qrupdate-static-1.1.2-3.31.aarch64.rpm"
RPM_HASH = "f2694ca4de9318e611a6f94fc2deaafe4abe4063426f05b5acbc8ea86fcad58e3f08275dd508aaea3958e867ed33b6bd04ac37064e2209067959773ac195c306"

RPROVIDES:${PN} += "qrupdate-static \
qrupdate-static(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
