SUMMARY = "Lazily-evaluated numerical array class, compatible with NumPy arrays"
DESCRIPTION = "lazyarray is a Python package that provides a lazily-evaluated numerical array \
class, larray, based on and compatible with NumPy arrays. \
 \
Lazy evaluation means that any operations on the array (potentially including \
array construction) are not performed immediately, but are delayed until \
evaluation is specifically requested. Evaluation of only parts of the array is \
also possible. \
 \
Use of an larray`can potentially save considerable computation time \
and memory in cases where: \
 \
* arrays are used conditionally (i.e. there are cases in which the array is \
  never used) \
* only parts of an array are used (for example in distributed computation, \
  in which each MPI node operates on a subset of the elements of the array)"
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "python39-lazyarray-0.5.2-1.6.noarch.rpm"
RPM_HASH = "5284e0376c1904c09779a0eae454ad0ab14f6b3f9c78e4fd89d6fe2100885dcea472affbf0c463f0719c891850592963e4817257f8cc14ef732f7aef0ba66a52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(lazyarray) python39-lazyarray python3dist(lazyarray)"
RDEPENDS:${PN} += "python(abi) python39-numpy"

inherit rpm
