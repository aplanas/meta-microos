SUMMARY = "Development files for libntlm, an NTLMv1 authentication library"
DESCRIPTION = "Libntlm provides routines to manipulate the structures used for the \
client end of Microsoft NTLMv1 authentication. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libntlm."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6"

RPM_NAME = "libntlm-devel-1.6-1.11.aarch64.rpm"
RPM_HASH = "9f39e2c085b8abdb7d54068506916a1d03c47443a0fe874c58b652d463f785e95ade2de69ab52a66419445453c3ae3973fae855f1df78e0b5478036ddf814f3d"

RPROVIDES:${PN} += "libntlm-devel libntlm-devel(aarch-64) pkgconfig(libntlm)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libntlm0"

inherit rpm
