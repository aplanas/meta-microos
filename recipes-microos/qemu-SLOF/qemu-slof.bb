SUMMARY = "Slimline Open Firmware - SLOF"
DESCRIPTION = "Slimline Open Firmware (SLOF) is an implementation of the IEEE 1275 standard. \
It can be used as partition firmware for pSeries machines running on QEMU or KVM."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-SLOF-8.0.2-1.1.noarch.rpm"
RPM_HASH = "43608c840fe0be9110832189c7da3359024a19f38b65d3a6f4b8fe96bd2b01e93aecac7881d8c188d2ba1a90427ef3031c6e2c3f757e14dcfda0850e80d9fe0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-SLOF"
RDEPENDS:${PN} += ""

inherit rpm
