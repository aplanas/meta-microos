SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains the files necessary to link against the guile libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.8"

RPM_NAME = "libguile1-devel-1.8.8-23.11.aarch64.rpm"
RPM_HASH = "67e0c6551486c0c89b5e4847adad78e06d00a521c21454869ed2793d1929b54c021413c1c9814522456e921832b9d7531622628e96bbd7241c1066b9dc372b89"

RPROVIDES:${PN} += "libguile1-devel libguile1-devel(aarch-64) pkgconfig(guile-1.8)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gmp-devel guile1 libguile-srfi-srfi-1-v-3-3 libguile-srfi-srfi-13-14-v-3-3 libguile-srfi-srfi-4-v-3-3 libguile-srfi-srfi-60-v-2-2 libguile17 libguilereadline-v-17-17 libltdl-devel ncurses-devel readline-devel"

inherit rpm
