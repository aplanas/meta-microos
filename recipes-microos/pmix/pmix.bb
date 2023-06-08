SUMMARY = "Process Management Interface for MPI"
DESCRIPTION = "The Process Management Interface (PMI) has been used for quite some time as a \
means of exchanging wireup information needed for interprocess communication. Two \
versions (PMI-1 and PMI-2) have been released as part of the MPICH effort. While \
PMI-2 demonstrates better scaling properties than its PMI-1 predecessor, attaining \
rapid launch and wireup of the roughly 1M processes executing across 100k nodes \
expected for exascale operations remains challenging. \
 \
This RPM contains all the tools necessary to compile and link against PMIx."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "pmix-3.2.3-10.1.aarch64.rpm"
RPM_HASH = "03f9b4034051880f99d8623768ab54f51697d0899f679ce270227b16fbf48cb42d77982671a2505239cf2ec7fa0a4ab9ec333be95c4cc67c9f3d5412ef7bfb9a"

RPROVIDES:${PN} += "pmix pmix(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpmix.so.2()(64bit)"

inherit rpm
