SUMMARY = "MLX5 runtime library"
DESCRIPTION = "This package contains the mlx5 runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "42.0"

RPM_NAME = "libmlx5-1-42.0-2.3.aarch64.rpm"
RPM_HASH = "b857252cf51dcaa2d588e70110ad022b0e84a0091259e41afd4e3987f515a273cf0461ca3c31755bddd7d28881ef4e40e0be1a5a1d40547b514383c63dc327a9"

RPROVIDES:${PN} += "libmlx5-1 libmlx5-1(aarch-64) libmlx5.so.1()(64bit) libmlx5.so.1(MLX5_1.0)(64bit) libmlx5.so.1(MLX5_1.1)(64bit) libmlx5.so.1(MLX5_1.10)(64bit) libmlx5.so.1(MLX5_1.11)(64bit) libmlx5.so.1(MLX5_1.12)(64bit) libmlx5.so.1(MLX5_1.13)(64bit) libmlx5.so.1(MLX5_1.14)(64bit) libmlx5.so.1(MLX5_1.15)(64bit) libmlx5.so.1(MLX5_1.16)(64bit) libmlx5.so.1(MLX5_1.17)(64bit) libmlx5.so.1(MLX5_1.18)(64bit) libmlx5.so.1(MLX5_1.19)(64bit) libmlx5.so.1(MLX5_1.2)(64bit) libmlx5.so.1(MLX5_1.20)(64bit) libmlx5.so.1(MLX5_1.21)(64bit) libmlx5.so.1(MLX5_1.22)(64bit) libmlx5.so.1(MLX5_1.23)(64bit) libmlx5.so.1(MLX5_1.24)(64bit) libmlx5.so.1(MLX5_1.3)(64bit) libmlx5.so.1(MLX5_1.4)(64bit) libmlx5.so.1(MLX5_1.5)(64bit) libmlx5.so.1(MLX5_1.6)(64bit) libmlx5.so.1(MLX5_1.7)(64bit) libmlx5.so.1(MLX5_1.8)(64bit) libmlx5.so.1(MLX5_1.9)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libibverbs.so.1()(64bit) libibverbs.so.1(IBVERBS_1.1)(64bit) libibverbs.so.1(IBVERBS_1.6)(64bit) libibverbs.so.1(IBVERBS_PRIVATE_34)(64bit)"

inherit rpm
