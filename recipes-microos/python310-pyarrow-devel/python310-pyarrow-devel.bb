SUMMARY = "Python library for Apache Arrow - header files"
DESCRIPTION = "Python library for Apache Arrow. \
 \
This package provides the header files within the python \
platlib for consuming modules using cythonization."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "11.0.0"

RPM_NAME = "python310-pyarrow-devel-11.0.0-1.2.aarch64.rpm"
RPM_HASH = "c1c474dda0be4410bae55cea04c1cb88e4b46b20dcc05ce474d453ab25fa05bb5523c624356c2474e8a5a76f209561d17e51c27b3973aa0fb04df7230bda019b"

RPROVIDES:${PN} += "python3-pyarrow-devel python310-pyarrow-devel python310-pyarrow-devel(aarch-64)"
RDEPENDS:${PN} += "python(abi) python310-Cython python310-pyarrow"

inherit rpm
