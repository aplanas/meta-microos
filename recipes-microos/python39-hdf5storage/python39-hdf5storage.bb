SUMMARY = "Utilities to read/write HDF5 files, including MATLAB v7.3 MAT files"
DESCRIPTION = "This Python package provides high level utilities to read/write a \
variety of Python types to/from HDF5 (Heirarchal Data Format) formatted \
files. This package also provides support for MATLAB MAT v7.3 formatted \
files, which are just HDF5 files with a different extension and some \
extra meta-data."
LICENSE = "BSD-3-Clause"

PV = "0.1.19"

RPM_NAME = "python39-hdf5storage-0.1.19-1.1.aarch64.rpm"
RPM_HASH = "a815335158aac7ec83fd6096c65d7cea986e699d207ed17b76f5e9f0e46d9889da6d731e58999c393cbef46f27c6563aefd9b0140d06456912c97c02bfcbc6e2"

RPROVIDES:${PN} += "python3.9dist(hdf5storage) \
python39-hdf5storage \
python39-hdf5storage(aarch-64) \
python3dist(hdf5storage)"
RDEPENDS:${PN} += "python(abi) \
python39-h5py \
python39-numpy"

inherit rpm
