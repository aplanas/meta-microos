SUMMARY = "RDMA core development libraries and headers"
DESCRIPTION = "RDMA core development libraries and headers."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "rdma-core-devel-45.0-1.1.aarch64.rpm"
RPM_HASH = "3d41b734c925a9a1e84ea490573f3f582ad27f7bec57eb6147bb3e7fe97a91e40002dca8e04ce3ad7f6366a8f3b39500747e384f8dfba02ee9c29c74129726b2"

RPROVIDES:${PN} += "ibacm-devel infiniband-diags-devel libibmad-devel libibumad-devel libibverbs-devel librdmacm-devel pkgconfig(libefa) pkgconfig(libibmad) pkgconfig(libibnetdisc) pkgconfig(libibumad) pkgconfig(libibverbs) pkgconfig(libmana) pkgconfig(libmlx4) pkgconfig(libmlx5) pkgconfig(librdmacm) rdma-core-devel rdma-core-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config infiniband-diags libefa1 libibumad3 libibverbs1 libmana1 libmlx4-1 libmlx5-1 librdmacm1 pkgconfig(libibmad) pkgconfig(libibumad) pkgconfig(libibverbs) rdma-core(aarch-64) rsocket"

inherit rpm
