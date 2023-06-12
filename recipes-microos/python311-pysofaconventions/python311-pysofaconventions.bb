SUMMARY = "Python implementation of the SOFA Convention"
DESCRIPTION = "pysofaconventions is a python implementation of the SOFA Specification."
LICENSE = "BSD-3-Clause"

PV = "0.1.5"

RPM_NAME = "python311-pysofaconventions-0.1.5-2.7.noarch.rpm"
RPM_HASH = "3516aa06e3ba74746891fa240b5025e6bf3bd7ebd85472dfc633226c8baf0f8c8fa1fc9a28fb0a4130e9c63254263874800a3eed25c346fd695b015c1becd30f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pysofaconventions) \
python311-pysofaconventions \
python3dist(pysofaconventions)"
RDEPENDS:${PN} += "python(abi) \
python311-netCDF4"

inherit rpm
