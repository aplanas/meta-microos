SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries \
needed to develop applications that require these."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "liboggz-devel-1.1.1-15.28.aarch64.rpm"
RPM_HASH = "987d24c70e787885cde2212b5003ae7d923306bfa20606b8f1aa2c5a33340d7c9e06e026ca754c08954b4dfdc56a8a627b2f34b9359556668a2f25540beb943f"

RPROVIDES:${PN} += "liboggz-devel liboggz-devel(aarch-64) pkgconfig(oggz)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libogg-devel liboggz2 pkgconfig(ogg)"

inherit rpm
