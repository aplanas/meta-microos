SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains mvapich2 shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE_2_20_0-gnu-mvapich2-hpc-2.20.0-1.21.aarch64.rpm"
RPM_HASH = "025e936fa646ca6cfeb4ff5187481c9c7147f7e9ef06dd7027fa019af86f1316ae455356bdc61c3e5830c02a2b15b20921bacb6c3eb4267e9311a52ab581d442"

RPROVIDES:${PN} += "libHYPRE_2_20_0-gnu-mvapich2-hpc libHYPRE_2_20_0-gnu-mvapich2-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh gnu-compilers-hpc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) lua-lmod mvapich2-gnu-hpc"

inherit rpm
