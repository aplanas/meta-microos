SUMMARY = "Header Files and C API Documentation for Tcl"
DESCRIPTION = "This package contains header files and documentation needed for writing \
Tcl extensions in compiled languages like C, C++, etc., or for \
embedding the Tcl interpreter in programs written in such languages. \
 \
This package is not needed for writing extensions or applications in \
the Tcl language itself."
LICENSE = "TCL"

PV = "8.6.13"

RPM_NAME = "tcl-devel-8.6.13-5.1.aarch64.rpm"
RPM_HASH = "e44f410beb5d7539136033e41939af4e7f32b839b56d1d061c86ab97a1f510a6ae775f8e4737ab4839ae0e7b867741abdae6a8d944aa8de9860fbef955837255"

RPROVIDES:${PN} += "itcl-devel pkgconfig(tcl) tcl-devel tcl-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config pkgconfig(zlib) tcl"

inherit rpm
