SUMMARY = "Open vSwitch core libraries"
DESCRIPTION = "Contains the shared libraries used by Open vSwitch and any eventual extensions."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "libopenvswitch-3_1-0-3.1.0-13.1.aarch64.rpm"
RPM_HASH = "16814701efc6af94f8f56562499799f8d974526734c32a8af90615f75fdcea28d53a1ce8408712cee5ea78ad5d55359c69c43af2ea64dedf7e1026565f0b1209"

RPROVIDES:${PN} += "libofproto-3.1.so.0()(64bit) libofproto-3.1.so.0(libofproto_0)(64bit) libopenvswitch-3.1.so.0()(64bit) libopenvswitch-3.1.so.0(libopenvswitch_0)(64bit) libopenvswitch-3_1-0 libopenvswitch-3_1-0(aarch-64) libovsdb-3.1.so.0()(64bit) libovsdb-3.1.so.0(libovsdb_0)(64bit) libsflow-3.1.so.0()(64bit) libsflow-3.1.so.0(libsflow_0)(64bit) libvtep-3.1.so.0()(64bit) libvtep-3.1.so.0(libvtep_0)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig dpdk ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap-ng.so.0()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libdpdk-23 libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) librte_eal.so.23()(64bit) librte_eal.so.23(DPDK_23)(64bit) librte_ethdev.so.23()(64bit) librte_ethdev.so.23(DPDK_23)(64bit) librte_mbuf.so.23()(64bit) librte_mbuf.so.23(DPDK_23)(64bit) librte_mempool.so.23()(64bit) librte_mempool.so.23(DPDK_23)(64bit) librte_meter.so.23()(64bit) librte_meter.so.23(DPDK_23)(64bit) librte_vhost.so.23()(64bit) librte_vhost.so.23(DPDK_23)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libunbound.so.8()(64bit)"

inherit rpm
