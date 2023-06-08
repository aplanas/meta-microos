SUMMARY = "Jitter entropy generator static library"
DESCRIPTION = "The Jitter RNG provides a noise source using the CPU execution \
timing jitter. It depends on a high-resolution time stamp. \
 \
This package contains the static library."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "3.4.1"

RPM_NAME = "jitterentropy-devel-static-3.4.1-2.1.aarch64.rpm"
RPM_HASH = "eea9ecb2bcc93cbd251ce9a4b2c9df28897019e2a16d13dca5a7ccd7172bccd06bcef353a395a0168744ffca3154061f3b6d2d77d3de470a2911504c5cf8adb3"

RPROVIDES:${PN} += "jitterentropy-devel-static jitterentropy-devel-static(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
