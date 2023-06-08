SUMMARY = "Development files for the Osmocom VTY interface library"
DESCRIPTION = "The libosmovty library implements the interactive command-line on the \
VTY (Virtual TTY), as well as configuration file parsing. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmovty."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmovty-devel-1.7.0-2.4.aarch64.rpm"
RPM_HASH = "4ff3f4ac8327b125a6f1fb6c5546269ee07d5a7468380af616304e4e8a091f9d89805827c07609ce1493d022deba30a1f13074b3b0859234eb76b8f07b26aa65"

RPROVIDES:${PN} += "libosmovty-devel libosmovty-devel(aarch-64) pkgconfig(libosmovty)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmocore-devel libosmovty9 pkgconfig(libosmocore) pkgconfig(talloc)"

inherit rpm
