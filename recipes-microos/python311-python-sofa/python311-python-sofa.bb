SUMMARY = "Spatially Oriented Format for Acoustics (SOFA) API for Python"
DESCRIPTION = "A Python API for reading, writing and creating SOFA files as defined \
by the SOFA conventions (version 1.0)."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-python-sofa-0.2.0-4.3.noarch.rpm"
RPM_HASH = "28c6a09f6fec05b1ce0e490f304d4b1fc1fbf969a9f1bf77003298063e957aaad7b0d4c24fc3c66251e63edc0d0cb98bc766f305ab40e1a7399b5a99676c0e84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-sofa) \
python311-python-sofa \
python3dist(python-sofa)"
RDEPENDS:${PN} += "python(abi) \
python311-netCDF4 \
python311-numpy \
python311-scipy"

inherit rpm
