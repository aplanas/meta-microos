SUMMARY = "SLURM PMI Library"
DESCRIPTION = "This package contains the library needed to run programs dynamically linked \
with SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "libpmi0-23.02.2-1.1.aarch64.rpm"
RPM_HASH = "0f4c1d9348aab6e02655894e736012e16a0c91319377ff5166f0ee5112ebe6d76aecba4925d5f2d144cf72433b9577f559cc43e89f06bf36f610d4af5decea33"

RPROVIDES:${PN} += "libpmi.so.0()(64bit) \
libpmi0 \
libpmi0(aarch-64) \
libpmi2.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libslurm_pmi.so()(64bit)"

inherit rpm
