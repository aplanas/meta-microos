SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains the shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.8"

RPM_NAME = "libguile-srfi-srfi-4-v-3-3-1.8.8-23.11.aarch64.rpm"
RPM_HASH = "7af32f42abf6e07a4d4b7a68e2b8de921166ed79d8bb22c5eaafd032ed3271dd6692eb7dd87165a50158efed923e0cc7a36b46a44f9277b3fbf7fcfcba3102d1"

RPROVIDES:${PN} += "libguile-srfi-srfi-4-v-3-3 libguile-srfi-srfi-4-v-3-3(aarch-64) libguile-srfi-srfi-4-v-3.so.3()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
