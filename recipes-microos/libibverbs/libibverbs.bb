SUMMARY = "Library & drivers for direct userspace use of InfiniBand/iWARP/RoCE hardware"
DESCRIPTION = "libibverbs is a library that allows userspace processes to use RDMA \
'verbs' as described in the InfiniBand Architecture Specification and \
the RDMA Protocol Verbs Specification.  This includes direct hardware \
access from userspace to InfiniBand/iWARP adapters (kernel bypass) for \
fast path operations. \
 \
Device-specific plug-in ibverbs userspace drivers are included: \
 \
- libcxgb3: Chelsio T3 iWARP HCA \
- libcxgb4: Chelsio T4 iWARP HCA \
- libefa: Amazon Elastic Fabric Adapter \
- libhfi1: Intel Omni-Path HFI \
- libhns: HiSilicon Hip06 SoC \
- libi40iw: Intel Ethernet Connection X722 RDMA \
- libipathverbs: QLogic InfiniPath HCA \
- libirdma: Intel Ethernet Connection RDMA \
- libmana: Microsoft Azure Network Adapter \
- libmlx4: Mellanox ConnectX-3 InfiniBand HCA \
- libmlx5: Mellanox Connect-IB/X-4+ InfiniBand HCA \
- libmthca: Mellanox InfiniBand HCA \
- libocrdma: Emulex OneConnect RDMA/RoCE Device \
- libqedr: QLogic QL4xxx RoCE HCA \
- librxe: A software implementation of the RoCE protocol \
- libsiw: A software implementation of the iWarp protocol \
- libvmw_pvrdma: VMware paravirtual RDMA device"
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "libibverbs-45.0-1.1.aarch64.rpm"
RPM_HASH = "398dc0dfc2500a27018ed40dd6806dadcea323780e2ff0b813c2116f24f7ff11ade4b8d2593ed384344fc0a313bb076ee865091d843e5ad1a1680824192f3220"

RPROVIDES:${PN} += "config(libibverbs) \
libbnxt_re-rdmav34.so()(64bit) \
libcxgb3-rdmav34.so()(64bit) \
libcxgb4-rdmav34.so()(64bit) \
liberdma-rdmav34.so()(64bit) \
libhfi1verbs-rdmav34.so()(64bit) \
libhns-rdmav34.so()(64bit) \
libibverbs \
libibverbs(aarch-64) \
libipathverbs-rdmav34.so()(64bit) \
libirdma-rdmav34.so()(64bit) \
libmthca-rdmav34.so()(64bit) \
libocrdma-rdmav34.so()(64bit) \
libqedr-rdmav34.so()(64bit) \
librxe-rdmav34.so()(64bit) \
libsiw-rdmav34.so()(64bit) \
libvmw_pvrdma-rdmav34.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libefa1 \
libibverbs.so.1()(64bit) \
libibverbs.so.1(IBVERBS_1.1)(64bit) \
libibverbs.so.1(IBVERBS_PRIVATE_34)(64bit) \
libmana1 \
libmlx4-1 \
libmlx5-1 \
rdma-core(aarch-64)"

inherit rpm
