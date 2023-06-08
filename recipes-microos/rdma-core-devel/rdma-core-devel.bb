SUMMARY = "RDMA core development libraries and headers"
DESCRIPTION = "RDMA core development libraries and headers."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "42.0"

RPM_NAME = "rdma-core-devel-42.0-2.3.aarch64.rpm"
RPM_HASH = "92d9e700791d43e03e6fd940b96704e8b37012d3fd9719868ba50b9f2e5ac423a91e2db73c9bced451b878f278bfef5e8395f07ed0efcb8b56a16a282fccbb9b"

RPROVIDES:${PN} += "ibacm-devel infiniband-diags-devel libibmad-devel libibumad-devel libibverbs-devel librdmacm-devel pkgconfig(libefa) pkgconfig(libibmad) pkgconfig(libibnetdisc) pkgconfig(libibumad) pkgconfig(libibverbs) pkgconfig(libmlx4) pkgconfig(libmlx5) pkgconfig(librdmacm) rdma-core-devel rdma-core-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config infiniband-diags libefa1 libibumad3 libibverbs1 libmlx4-1 libmlx5-1 librdmacm1 pkgconfig(libibmad) pkgconfig(libibumad) pkgconfig(libibverbs) rdma-core(aarch-64) rsocket"

inherit rpm
