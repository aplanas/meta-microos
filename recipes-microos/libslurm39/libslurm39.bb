SUMMARY = "Libraries for SLURM"
DESCRIPTION = "This package contains the library needed to run programs dynamically linked \
with SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "libslurm39-23.02.2-1.1.aarch64.rpm"
RPM_HASH = "4bf1f5a7ec90608643765fe00307f307db298e7a832e88884ea96e1735cc703053b22a286f436063a5e4245e4ad33497f98ba3528bea83e7618dbaa9c477fea4"

RPROVIDES:${PN} += "libslurm libslurm.so.39()(64bit) libslurm39 libslurm39(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libresolv.so.2()(64bit) libresolv.so.2(GLIBC_2.17)(64bit) slurm-config"

inherit rpm
