SUMMARY = "Development files for openvdb"
DESCRIPTION = "This package contains the C++ header files and symbolic links to the shared \
libraries for openvdb. If you would like to develop programs using openvdb, \
you will need to install openvdb-devel."
LICENSE = "Apache-2.0"

PV = "9.0.0"

RPM_NAME = "openvdb-devel-9.0.0-3.5.aarch64.rpm"
RPM_HASH = "4398f2959cad90a16eca2016e8ffa0693c9259cc1e64468fc4189117a9b99676fb8c26124517c8a2473ba10cb51e1317e476ca15b8f76fbd040b0b12268a08cb"

RPROVIDES:${PN} += "openvdb-devel openvdb-devel(aarch-64)"
RDEPENDS:${PN} += "libopenvdb9_0"

inherit rpm
