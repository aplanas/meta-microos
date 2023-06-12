SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.0.9"

RPM_NAME = "guile-3.0.9-1.1.aarch64.rpm"
RPM_HASH = "74ec9b7365d984af6f5eb8260e895b635553fcfc08a41ea964d0e1ba1f958ce8f2dc6c97aed57c7741f35e949aa6ff3b6709eab1b5a5bcd9375eb1044b3786e8"

RPROVIDES:${PN} += "guile guile(aarch-64)"
RDEPENDS:${PN} += "/bin/sh fileutils ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libguile-3.0.so.1()(64bit) libguile-3.0.so.1(GUILE_2.0)(64bit) sh-utils"

inherit rpm
