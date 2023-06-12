SUMMARY = "Header Files and C API Documentation for Tk"
DESCRIPTION = "This package contains header files and documentation needed for writing \
Tk extensions in compiled languages like C, C++, etc., or for embedding \
Tk in programs written in such languages. \
 \
This package is not needed for writing extensions or applications for \
Tk in the Tcl language itself. \
 \
 \
 \
Authors: \
-------- \
    The Tcl Core Team <tcl-core@lists.sourceforge.net>"
LICENSE = "TCL"

PV = "8.6.13"

RPM_NAME = "tk-devel-8.6.13-1.3.aarch64.rpm"
RPM_HASH = "8fc8fb54f41c221be35f1398fc08d7181a731dfe582a2e41fbd2904f339729af109789b91408bb04414c10b644f1220fa12983c2d22172a954a146b23b6d9db3"

RPROVIDES:${PN} += "pkgconfig(tk) \
tk-devel \
tk-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig(tcl) \
tcl-devel \
tk \
xorg-x11-libX11-devel"

inherit rpm
