SUMMARY = "Scikits sparse matrix package"
DESCRIPTION = "Sparse matrix tools. \
 \
This is a sparse matrix code in Python that plays well with \
scipy.sparse, but that is somehow unsuitable for inclusion in scipy \
proper. \
 \
There is a wrapper for the CHOLMOD library for sparse Cholesky \
decomposition."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.5"

RPM_NAME = "python39-scikit-sparse-0.4.5-1.12.aarch64.rpm"
RPM_HASH = "1ca320af055ccf19cae3dfaf7e3013fa6ff57bca563328aefe0282e0a803d1c28a10164ee5ddd0eb2d449e2231f73b3469eab2bf0bceafb6ce8d14c10cb8ef85"

RPROVIDES:${PN} += "python3.9dist(scikit-sparse) python39-scikit-sparse python39-scikit-sparse(aarch-64) python3dist(scikit-sparse)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcholmod.so.3()(64bit) python(abi) python39-numpy python39-scipy"

inherit rpm
