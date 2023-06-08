SUMMARY = "Python library for Apache Arrow - header files"
DESCRIPTION = "Python library for Apache Arrow. \
 \
This package provides the header files within the python \
platlib for consuming modules using cythonization."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "11.0.0"

RPM_NAME = "python39-pyarrow-devel-11.0.0-1.2.aarch64.rpm"
RPM_HASH = "e3e39dc3bd78c19ed4b66bc8e8019cf658f111484a4306e855242ea4b7170701d6a7cc1ca04d8039bd537236c91058b1c5aceb98c36f2b36907976ed19a43b96"

RPROVIDES:${PN} += "python39-pyarrow-devel python39-pyarrow-devel(aarch-64)"
RDEPENDS:${PN} += "python(abi) python39-Cython python39-pyarrow"

inherit rpm
