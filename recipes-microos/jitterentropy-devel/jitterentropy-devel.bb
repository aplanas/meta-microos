SUMMARY = "Jitter entropy generator development header and library"
DESCRIPTION = "The Jitter RNG provides a noise source using the CPU execution \
timing jitter. It depends on a high-resolution time stamp. \
 \
This package contains the development header and library."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "3.4.1"

RPM_NAME = "jitterentropy-devel-3.4.1-2.1.aarch64.rpm"
RPM_HASH = "9212152197c66b7cd05805911657ad7dbb3cf1547731d82ecea819ff80cd6c6a14f4b7c5cdcd4743f30094e751665393e2602415c9c9e78f4c14faa6f1a2acef"

RPROVIDES:${PN} += "jitterentropy-devel \
jitterentropy-devel(aarch-64)"
RDEPENDS:${PN} += "libjitterentropy3"

inherit rpm
