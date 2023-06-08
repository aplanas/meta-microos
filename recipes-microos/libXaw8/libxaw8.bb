SUMMARY = "The X Athena Widget Set"
DESCRIPTION = "The X Window System Athena widget set implements simple user \
interfaces based upon the X Toolkit Intrinsics (Xt) library."
LICENSE = "MIT"

PV = "1.0.15"

RPM_NAME = "libXaw8-1.0.15-1.3.aarch64.rpm"
RPM_HASH = "24e7c94d9d8928cc968e6684e800c6b6b86a9df7a764b9416c49407c33f88ee6ca42187e5664913d28e27827e04e2c2e40eab1dc93fdc45667a8b91a9604cb95"

RPROVIDES:${PN} += "libXaw.so.8 libXaw8 libXaw8(aarch-64) libXaw8.so.8"
RDEPENDS:${PN} += "/sbin/ldconfig libXaw7"

inherit rpm
