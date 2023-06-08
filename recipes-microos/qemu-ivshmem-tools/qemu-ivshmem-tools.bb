SUMMARY = "Inter-VM Shared Memory Tools for QEMU"
DESCRIPTION = "This package contains a sample shared memory client and server which utilize \
QEMU's Inter-VM shared memory device as specified by the ivshmem client-server \
protocol specification documented in docs/specs/ivshmem-spec.txt in QEMU source \
code."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-ivshmem-tools-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "1a2b89aa90d9b4cd210b7c9b89a00e47ae5c1c10b7b3513c7c0c01e216a8adbd9020a6605a309dd6525afe29191e842c46776c2ddb1eb21063540207ef30edb8"

RPROVIDES:${PN} += "qemu-ivshmem-tools qemu-ivshmem-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
