SUMMARY = "Optimizing numpys einsum function"
DESCRIPTION = "Optimized einsum can significantly reduce the overall execution time of einsum-like expressions (e.g., \
`np.einsum`,`dask.array.einsum`,`pytorch.einsum`,`tensorflow.einsum`) \
by optimizing the expression's contraction order and dispatching many \
operations to canonical BLAS, cuBLAS, or other specialized routines. Optimized \
einsum is agnostic to the backend and can handle NumPy, Dask, PyTorch, \
Tensorflow, CuPy, Sparse, Theano, JAX, and Autograd arrays as well as potentially \
any library which conforms to a standard API. See the \
[**documentation**](http://optimized-einsum.readthedocs.io) for more \
information."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python310-opt-einsum-3.3.0-2.7.noarch.rpm"
RPM_HASH = "608e81dc2b945a8639e6a2621bb16c90d353d0405a2e794f34611880389fff43a6841facc8a8890b4735bddddcfaa0225c562658282822f0c059d4d837d1d830"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opt-einsum python3.10dist(opt-einsum) python310-opt-einsum python3dist(opt-einsum)"
RDEPENDS:${PN} += "python(abi) python310-numpy"

inherit rpm
