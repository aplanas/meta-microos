SUMMARY = "C library intended for use on embedded systems"
DESCRIPTION = "Newlib is a C library intended for use on embedded systems. It is a \
conglomeration of several library parts, all under free software licenses \
that make them easily usable on embedded products."
LICENSE = "BSD-3-Clause & MIT & LGPL-2.0-or-later & ISC"

PV = "4.3.0.20230120"

RPM_NAME = "newlib-4.3.0.20230120-2.1.noarch.rpm"
RPM_HASH = "7593c7e4d313b82e3f40cc791a9b2b1c7066789afa2d19bdc9bbb899a0e66e8476297836103afc775f9435d26738fb2d05a0b1af3d1e5f27450f13afafc51b9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "newlib"
RDEPENDS:${PN} += ""

inherit rpm
