SUMMARY = "Static libraries for MPICH HPC version 4.0.2"
DESCRIPTION = "MPICH is a freely available, portable implementation of MPI, the \
Standard for message-passing libraries. This package contains manpages, \
headers and libraries needed for developing MPI applications. \
 \
This RPM contains the static library files, which are packaged separately from \
the dynamic library and headers."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-ofi_4_0_2-gnu-hpc-devel-static-4.0.2-3.3.aarch64.rpm"
RPM_HASH = "c4687d2a0e919f291f2c93d03f94b9154644477c365151a743d0d5a8469584420a891d12e753ded1c2d2c60f263747f879864fe9faffc93443cf126e7c8c03b8"

RPROVIDES:${PN} += "mpich-ofi_4_0_2-gnu-hpc-devel-static mpich-ofi_4_0_2-gnu-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "mpich-ofi_4_0_2-gnu-hpc-devel"

inherit rpm
