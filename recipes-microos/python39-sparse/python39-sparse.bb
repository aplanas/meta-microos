SUMMARY = "Sparse n-dimensional arrays for Python"
DESCRIPTION = "This module implements sparse multidimensional arrays on top of NumPy and \
Scipy.sparse. It generalizes the scipy.sparse.coo_matrix layout, but \
extends beyond just rows and columns to an arbitrary number of \
dimensions. \
 \
The original motivation is for machine learning algorithms, but it is \
intended for somewhat general use."
LICENSE = "BSD-3-Clause"

PV = "0.14.0"

RPM_NAME = "python39-sparse-0.14.0-1.2.noarch.rpm"
RPM_HASH = "f000555bcaae26b33dabb4fe7761973458b4ee0081ffd39e635d6c2c0ff0c68416cedc7331e2e05c11828a7b9260ffcf86520d39bf02bd56039f0b469e54c511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sparse) \
python39-sparse \
python3dist(sparse)"
RDEPENDS:${PN} += "python(abi) \
python39-numba \
python39-numpy \
python39-scipy"

inherit rpm
