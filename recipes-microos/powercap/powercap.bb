SUMMARY = "Tools for the Linux Power Capping Framework"
DESCRIPTION = "This project provides the powercap library -- a generic C interface to the \
Linux power capping framework (sysfs interface). It includes an implementation \
for working with Intel Running Average Power Limit (RAPL). \
 \
It also provides the following applications: \
 \
powercap-info - view powercap control type hierarchies or zone/constraint-specific configurations \
powercap-set - set powercap control type zone/constraint-specific configurations"
LICENSE = "GPL-2.0-only"

PV = "0.6.0"

RPM_NAME = "powercap-0.6.0-1.3.aarch64.rpm"
RPM_HASH = "cab0373c57f2e92d32f60617efaf668a54b4ee6e3d36f8acd66db0b045184f96e0f0b2b161a8bafaf0848fa37757969a613ff6cc1d5590b37d264ad0badbc04f"

RPROVIDES:${PN} += "libpowercap.so.0()(64bit) \
powercap \
powercap(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
