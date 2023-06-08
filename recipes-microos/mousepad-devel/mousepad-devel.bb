SUMMARY = "Development files for Mousepad"
DESCRIPTION = "Development files for Mousepad plugin development"
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "mousepad-devel-0.6.0-1.3.aarch64.rpm"
RPM_HASH = "532769aa7873ec4484fbc338b1f47fca809bc990bfa3bc98c4170f35e3471e2c78d1c523c1474b094813ae39e5ec0af34cce41d5a107222ad617e904554af9e2"

RPROVIDES:${PN} += "mousepad-devel mousepad-devel(aarch-64)"
RDEPENDS:${PN} += "libmousepad0"

inherit rpm
