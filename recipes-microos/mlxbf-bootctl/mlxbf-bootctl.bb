SUMMARY = "User-space driver for Mellanox BlueField SoC"
DESCRIPTION = "mlxbf-bootctl is used to control the two boot firmware partitions present on most Mellanox BlueField devices."
LICENSE = "BSD-2-Clause"

PV = "1.1.6.14"

RPM_NAME = "mlxbf-bootctl-1.1.6.14-1.2.aarch64.rpm"
RPM_HASH = "36e6a20730e7964cdac712c3299d19a21c164adfc9f76d420be79a7445013e0fa9364df177d7b16c38dae9ec145bcc9afe8326c4cce20bba41636186b3970a02"

RPROVIDES:${PN} += "mlxbf-bootctl mlxbf-bootctl(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
