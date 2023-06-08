SUMMARY = "Python implementation of the SOFA Convention"
DESCRIPTION = "pysofaconventions is a python implementation of the SOFA Specification."
LICENSE = "BSD-3-Clause"

PV = "0.1.5"

RPM_NAME = "python310-pysofaconventions-0.1.5-2.7.noarch.rpm"
RPM_HASH = "bb845889a820bfff0fe352deae6c191363ffc3f301e0dab8c101e7111765b16b83446b10df59e63474f6102e2b661cbac450bf2322300f11336a94adc666324c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pysofaconventions python3.10dist(pysofaconventions) python310-pysofaconventions python3dist(pysofaconventions)"
RDEPENDS:${PN} += "python(abi) python310-netCDF4"

inherit rpm
