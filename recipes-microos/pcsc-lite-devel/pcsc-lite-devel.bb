SUMMARY = "Development package for the MUSCLE project SmartCards library"
DESCRIPTION = "This package contains the development files for pcsc-lite. It allows to \
compile plugins for the pcsc-lite package."
LICENSE = "BSD-3-Clause & GPL-3.0-or-later"

PV = "1.9.9"

RPM_NAME = "pcsc-lite-devel-1.9.9-2.3.aarch64.rpm"
RPM_HASH = "6d41771975f2ddfb66c9467724c0826695382d149deb310dbc02ab7261a323d751ef78141ebeb82a512624e77039a9a15388d9f995bc2cf91e74d60181ce16d8"

RPROVIDES:${PN} += "pcsc-lite-devel pcsc-lite-devel(aarch-64) pkgconfig(libpcsclite)"
RDEPENDS:${PN} += "/usr/bin/pkg-config /usr/bin/python3 glibc-devel libpcsclite1 libpcscspy0 pcsc-lite"

inherit rpm
