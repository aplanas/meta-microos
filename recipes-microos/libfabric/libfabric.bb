SUMMARY = "User-space RDMA Fabric Interfaces"
DESCRIPTION = "libfabric provides a user-space API to access high-performance fabric \
services, such as RDMA. This package only contains the fi_info binary."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "1.18.0"

RPM_NAME = "libfabric-1.18.0-1.1.aarch64.rpm"
RPM_HASH = "8457e9092e94af6ae3d71a9a9029fdc9927d252bcc5257176c0e149e7ed92ffad47fa20d26b4c8b86c15b51e3dded468d0c6bbe306bc014e9491fce01b3f56b8"

RPROVIDES:${PN} += "libfabric libfabric(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfabric.so.1()(64bit) libfabric.so.1(FABRIC_1.0)(64bit) libfabric.so.1(FABRIC_1.1)(64bit) libfabric.so.1(FABRIC_1.3)(64bit) libfabric.so.1(FABRIC_1.4)(64bit)"

inherit rpm
