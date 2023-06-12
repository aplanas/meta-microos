SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python311-h5py-openmpi2-3.8.0-2.5.aarch64.rpm"
RPM_HASH = "cb2507d5d7b96e10ffe647b11cc736fe6ae06999cb268800e5ae56119818880151282890c90969b95f7d0059e86fdedd2a1137826944cefad0a2dfb1fcec447a"

RPROVIDES:${PN} += "python3.11dist(h5py) \
python311-h5py-openmpi2 \
python311-h5py-openmpi2(aarch-64) \
python3dist(h5py)"
RDEPENDS:${PN} += "hdf5-openmpi2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libhdf5.so.200()(64bit) \
libhdf5_hl.so.200()(64bit) \
libmpi.so.20()(64bit) \
python311-mpi4py \
python311-numpy"

inherit rpm
