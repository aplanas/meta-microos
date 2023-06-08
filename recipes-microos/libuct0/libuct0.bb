SUMMARY = "Infiniband Unified Communication Transport"
DESCRIPTION = "Low-level API that expose network operations supported by underlying \
hardware."
LICENSE = "BSD-3-Clause"

PV = "1.14.0"

RPM_NAME = "libuct0-1.14.0-1.1.aarch64.rpm"
RPM_HASH = "68c5e36b46d0d43111fc3db26a4669d3ae7cf3794dc60cba1f859e9fe8bbbf5e9fbd81d18ebebe25f2322d73e4e0da274440909cf9cc360d605223cf362732da"

RPROVIDES:${PN} += "libuct.so.0()(64bit) libuct0 libuct0(aarch-64) libuct_cma.so.0()(64bit) libuct_ib.so.0()(64bit) libuct_rdmacm.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libibverbs.so.1()(64bit) libibverbs.so.1(IBVERBS_1.0)(64bit) libibverbs.so.1(IBVERBS_1.1)(64bit) libibverbs.so.1(IBVERBS_1.10)(64bit) libibverbs.so.1(IBVERBS_1.12)(64bit) libibverbs.so.1(IBVERBS_1.8)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libmlx5.so.1()(64bit) libmlx5.so.1(MLX5_1.1)(64bit) libmlx5.so.1(MLX5_1.11)(64bit) libmlx5.so.1(MLX5_1.19)(64bit) libmlx5.so.1(MLX5_1.2)(64bit) libmlx5.so.1(MLX5_1.3)(64bit) libmlx5.so.1(MLX5_1.7)(64bit) libmlx5.so.1(MLX5_1.8)(64bit) libnuma.so.1()(64bit) libnuma.so.1(libnuma_1.1)(64bit) libnuma.so.1(libnuma_1.2)(64bit) librdmacm.so.1()(64bit) librdmacm.so.1(RDMACM_1.0)(64bit) librdmacm.so.1(RDMACM_1.2)(64bit) libucs.so.0()(64bit)"

inherit rpm
