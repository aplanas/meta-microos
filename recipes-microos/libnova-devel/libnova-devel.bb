SUMMARY = "Development files for libnova"
DESCRIPTION = "This package contains development files for libnova."
LICENSE = "LGPL-2.0+"

PV = "0.15.0"

RPM_NAME = "libnova-devel-0.15.0-10.29.aarch64.rpm"
RPM_HASH = "317359d39a78d76e3414b7a8f6948d29344c46df36d0cf155abc7138220345b763730272a6bb755f6b95479064e23d2a308ea4e87dde4d94a1cfed76f64d2b8e"

RPROVIDES:${PN} += "libnova-devel libnova-devel(aarch-64)"
RDEPENDS:${PN} += "glibc-devel libc.so.6(GLIBC_2.34)(64bit) libnova-0.15.so.0()(64bit) libnova-0_15-0"

inherit rpm
