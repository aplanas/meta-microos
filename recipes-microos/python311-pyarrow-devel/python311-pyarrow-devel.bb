SUMMARY = "Python library for Apache Arrow - header files"
DESCRIPTION = "Python library for Apache Arrow. \
 \
This package provides the header files within the python \
platlib for consuming modules using cythonization."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "11.0.0"

RPM_NAME = "python311-pyarrow-devel-11.0.0-1.2.aarch64.rpm"
RPM_HASH = "c0df6d4039a4f1f33b8262263b29759fe23287720d835ce999ceb0e90384ff84f94346b4c550fd6f17a64e264e8544b0ddd71e3d32d339c45d0423d46069eb47"

RPROVIDES:${PN} += "python311-pyarrow-devel python311-pyarrow-devel(aarch-64)"
RDEPENDS:${PN} += "python(abi) python311-Cython python311-pyarrow"

inherit rpm
