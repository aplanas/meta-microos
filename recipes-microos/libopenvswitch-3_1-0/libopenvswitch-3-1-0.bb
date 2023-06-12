SUMMARY = "Open vSwitch core libraries"
DESCRIPTION = "Contains the shared libraries used by Open vSwitch and any eventual extensions."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "libopenvswitch-3_1-0-3.1.0-14.1.aarch64.rpm"
RPM_HASH = "8387b7e8e3f3826be7284a0a4fcf68179b6f82bc1068fcd5529853182999f62933133ac21cc26c9ea15ecff3c439d76e4616e8c9fcf9c819891bb29e8472c7e5"

RPROVIDES:${PN} += "libofproto-3.1.so.0()(64bit) \
libofproto-3.1.so.0(libofproto_0)(64bit) \
libopenvswitch-3.1.so.0()(64bit) \
libopenvswitch-3.1.so.0(libopenvswitch_0)(64bit) \
libopenvswitch-3_1-0 \
libopenvswitch-3_1-0(aarch-64) \
libovsdb-3.1.so.0()(64bit) \
libovsdb-3.1.so.0(libovsdb_0)(64bit) \
libsflow-3.1.so.0()(64bit) \
libsflow-3.1.so.0(libsflow_0)(64bit) \
libvtep-3.1.so.0()(64bit) \
libvtep-3.1.so.0(libvtep_0)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
dpdk \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcap-ng.so.0()(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libdpdk-23 \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
librte_eal.so.23()(64bit) \
librte_eal.so.23(DPDK_23)(64bit) \
librte_ethdev.so.23()(64bit) \
librte_ethdev.so.23(DPDK_23)(64bit) \
librte_mbuf.so.23()(64bit) \
librte_mbuf.so.23(DPDK_23)(64bit) \
librte_mempool.so.23()(64bit) \
librte_mempool.so.23(DPDK_23)(64bit) \
librte_meter.so.23()(64bit) \
librte_meter.so.23(DPDK_23)(64bit) \
librte_vhost.so.23()(64bit) \
librte_vhost.so.23(DPDK_23)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libunbound.so.8()(64bit)"

inherit rpm
