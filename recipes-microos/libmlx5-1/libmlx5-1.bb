SUMMARY = "MLX5 runtime library"
DESCRIPTION = "This package contains the mlx5 runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "libmlx5-1-45.0-1.1.aarch64.rpm"
RPM_HASH = "e78ab7f55c2e57bb7a74033cfa95aeae6aab5860bfa6b6ef932667264ec1bf1d49adf2c1b10a7d6835215821d09b1b64636f773e5faea7806a97f2e8eaaa81da"

RPROVIDES:${PN} += "libmlx5-1 libmlx5-1(aarch-64) libmlx5.so.1()(64bit) libmlx5.so.1(MLX5_1.0)(64bit) libmlx5.so.1(MLX5_1.1)(64bit) libmlx5.so.1(MLX5_1.10)(64bit) libmlx5.so.1(MLX5_1.11)(64bit) libmlx5.so.1(MLX5_1.12)(64bit) libmlx5.so.1(MLX5_1.13)(64bit) libmlx5.so.1(MLX5_1.14)(64bit) libmlx5.so.1(MLX5_1.15)(64bit) libmlx5.so.1(MLX5_1.16)(64bit) libmlx5.so.1(MLX5_1.17)(64bit) libmlx5.so.1(MLX5_1.18)(64bit) libmlx5.so.1(MLX5_1.19)(64bit) libmlx5.so.1(MLX5_1.2)(64bit) libmlx5.so.1(MLX5_1.20)(64bit) libmlx5.so.1(MLX5_1.21)(64bit) libmlx5.so.1(MLX5_1.22)(64bit) libmlx5.so.1(MLX5_1.23)(64bit) libmlx5.so.1(MLX5_1.24)(64bit) libmlx5.so.1(MLX5_1.3)(64bit) libmlx5.so.1(MLX5_1.4)(64bit) libmlx5.so.1(MLX5_1.5)(64bit) libmlx5.so.1(MLX5_1.6)(64bit) libmlx5.so.1(MLX5_1.7)(64bit) libmlx5.so.1(MLX5_1.8)(64bit) libmlx5.so.1(MLX5_1.9)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libibverbs.so.1()(64bit) libibverbs.so.1(IBVERBS_1.1)(64bit) libibverbs.so.1(IBVERBS_1.6)(64bit) libibverbs.so.1(IBVERBS_PRIVATE_34)(64bit)"

inherit rpm
