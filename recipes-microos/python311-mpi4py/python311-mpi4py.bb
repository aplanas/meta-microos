SUMMARY = "MPI for Python"
DESCRIPTION = "This package provides Python bindings for the Message Passing \
Interface (MPI) standard. It is implemented on top of the MPI-1/2/3 \
specification and exposes an API which grounds on the standard MPI-2 \
C++ bindings. \
 \
This package supports: \
  + Communication of any picklable Python object \
    * Point-to-point: send & receive \
    * Collective: broadcast, scatter & gather, reductions \
  + Communication of Python object exposing the Python buffer \
    interface (NumPy arrays, builtin bytes/string/array objects) \
    * Point-to-point: blocking/nonbloking/persistent send & receive \
    * Collective: broadcast, block/vector scatter & gather, reductions \
  + Process groups and communication domains \
    * Creation of new intra/inter communicators \
    * Cartesian & graph topologies \
  + Parallel input/output: \
    * read & write \
    * blocking/nonbloking & collective/noncollective \
    * individual/shared file pointers & explicit offset \
  + Dynamic process management \
    * spawn & spawn multiple \
    * accept/connect \
    * name publishing & lookup \
  + One-sided operations \
    * remote memory access: put, get, accumulate \
    * passive target syncronization: start/complete & post/wait \
    * active target syncronization: lock & unlock"
LICENSE = "BSD-2-Clause"

PV = "3.1.4"

RPM_NAME = "python311-mpi4py-3.1.4-2.5.aarch64.rpm"
RPM_HASH = "2f8787217b0dde5f295ccd9a051276b7a391b74eee9581f4c77e25a356cf96c1ea95406ca088e1bb846d034f50aa2a2891b6732ed6a0e0de8d3fe7d80d9e7600"

RPROVIDES:${PN} += "libmpe.so()(64bit) libvt-hyb.so()(64bit) libvt-mpi.so()(64bit) libvt.so()(64bit) python3.11dist(mpi4py) python311-mpi4py python311-mpi4py(aarch-64) python3dist(mpi4py)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libmpi.so.40()(64bit) python(abi)"

inherit rpm
