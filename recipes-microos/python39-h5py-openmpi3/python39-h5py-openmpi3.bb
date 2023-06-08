SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python39-h5py-openmpi3-3.8.0-2.5.aarch64.rpm"
RPM_HASH = "e531b73b498bf698eb0876570b3aadf18812f9affd8154c7c3022d7a6a539918f4074c75e1074eae4491b97b7e4834ad7c8e93ce296aef4ffe68f2fe2d93b40d"

RPROVIDES:${PN} += "python3.9dist(h5py) python39-h5py-openmpi3 python39-h5py-openmpi3(aarch-64) python3dist(h5py)"
RDEPENDS:${PN} += "hdf5-openmpi3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libhdf5.so.200()(64bit) libhdf5_hl.so.200()(64bit) libmpi.so.40()(64bit) python39-mpi4py python39-numpy"

inherit rpm
