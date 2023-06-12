SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python310-h5py-openmpi1-3.8.0-2.5.aarch64.rpm"
RPM_HASH = "cd7173f2b465bd8ebc227bc457a1b4983497cf4509854a2ab0408a59530b48794f8c0ddd80bd18852bc5bbb605eece9a86379f08d4313f8e4bd27ce61665d5c7"

RPROVIDES:${PN} += "python3-h5py-openmpi1 \
python3.10dist(h5py) \
python310-h5py-openmpi1 \
python310-h5py-openmpi1(aarch-64) \
python3dist(h5py)"
RDEPENDS:${PN} += "hdf5-openmpi1 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libhdf5.so.200()(64bit) \
libhdf5_hl.so.200()(64bit) \
libmpi.so.12()(64bit) \
python310-mpi4py \
python310-numpy"

inherit rpm
