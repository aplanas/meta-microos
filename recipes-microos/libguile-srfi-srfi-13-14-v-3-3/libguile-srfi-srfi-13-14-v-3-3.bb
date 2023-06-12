SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains the shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.8"

RPM_NAME = "libguile-srfi-srfi-13-14-v-3-3-1.8.8-23.11.aarch64.rpm"
RPM_HASH = "5ac817caee1e2fcd92cbe85c4c4c2052f94bc06bfc0c6dcd63d9d26f82574c061ca32fbed373b776e051cb484d57fe4823c19c8d754a6afe93c2b5b44be708cd"

RPROVIDES:${PN} += "libguile-srfi-srfi-13-14-v-3-3 \
libguile-srfi-srfi-13-14-v-3-3(aarch-64) \
libguile-srfi-srfi-13-14-v-3.so.3()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
