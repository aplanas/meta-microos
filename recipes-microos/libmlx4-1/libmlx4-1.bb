SUMMARY = "MLX4 runtime library"
DESCRIPTION = "This package contains the mlx4 runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "42.0"

RPM_NAME = "libmlx4-1-42.0-2.3.aarch64.rpm"
RPM_HASH = "0275302080fc007ebd73ca9bd58e131168de993c69f04cc3305b9d623187c78563f1a3223f5394d78713d941b3bb24466d3c3f7a8e9be3e53d8cadc40ba0e28f"

RPROVIDES:${PN} += "libmlx4-1 libmlx4-1(aarch-64) libmlx4.so.1()(64bit) libmlx4.so.1(MLX4_1.0)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libibverbs.so.1()(64bit) libibverbs.so.1(IBVERBS_1.1)(64bit) libibverbs.so.1(IBVERBS_PRIVATE_34)(64bit)"

inherit rpm
