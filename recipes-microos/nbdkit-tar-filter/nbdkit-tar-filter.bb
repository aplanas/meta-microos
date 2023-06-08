SUMMARY = "Tar archive filter for nbdkit"
DESCRIPTION = "This package is a tar archive filter for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-tar-filter-1.32.2-1.3.aarch64.rpm"
RPM_HASH = "a881351cac08db3267ae11b90d072b6110cd334d707aac43cd389fe11717e52355dc25f4544ea3f33cbb00729229f9dc8bfb8a17624761addfd4696144a6363e"

RPROVIDES:${PN} += "nbdkit-tar-filter nbdkit-tar-filter(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) nbdkit-server tar"

inherit rpm
