SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.0.8"

RPM_NAME = "guile-3.0.8-4.7.aarch64.rpm"
RPM_HASH = "447e5e84272bd754a0fb9656fd4c222ce4bb49d594ccec80dcbdd4e380a644894f450f88816c55942353d2c9b31281ff17d3fcf1b56421f4a3e6c59078f37de8"

RPROVIDES:${PN} += "guile guile(aarch-64)"
RDEPENDS:${PN} += "/bin/sh fileutils ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libguile-3.0.so.1()(64bit) libguile-3.0.so.1(GUILE_2.0)(64bit) sh-utils"

inherit rpm
