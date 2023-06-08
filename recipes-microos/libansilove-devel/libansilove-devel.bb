SUMMARY = "Library for converting ANSI, ASCII, and other formats to PNG"
DESCRIPTION = "This library contains shared code regarding the conversion of ANSI and \
artscene related file formats into PNG images. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libansilove."
LICENSE = "BSD-2-Clause"

PV = "1.3.1"

RPM_NAME = "libansilove-devel-1.3.1-1.5.aarch64.rpm"
RPM_HASH = "103df724d4ea3ca86f6bc0cba79573437b30a6af47762001ae4900a0e62bb8d1e273b76e8fda22499ee2ba3bfa9ebacf3fb25c653f5a83750cef483d8aa01bfa"

RPROVIDES:${PN} += "libansilove-devel libansilove-devel(aarch-64)"
RDEPENDS:${PN} += "libansilove1"

inherit rpm
