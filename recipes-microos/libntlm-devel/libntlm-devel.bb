SUMMARY = "Development files for libntlm, an NTLMv1 authentication library"
DESCRIPTION = "Libntlm provides routines to manipulate the structures used for the \
client end of Microsoft NTLMv1 authentication. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libntlm."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6"

RPM_NAME = "libntlm-devel-1.6-2.1.aarch64.rpm"
RPM_HASH = "05ddebb997818ae6a1ce86b60d9c92153e5dd5924f3bd2f0085a834412a5803450cdab824b65a3d567f595412a56349e26d6af409c816f620e28b95e02b16d21"

RPROVIDES:${PN} += "libntlm-devel libntlm-devel(aarch-64) pkgconfig(libntlm)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libntlm0"

inherit rpm
