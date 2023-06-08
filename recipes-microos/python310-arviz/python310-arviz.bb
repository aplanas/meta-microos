SUMMARY = "Exploratory analysis of Bayesian models"
DESCRIPTION = "ArviZ is a Python package for exploratory analysis of Bayesian models. Includes \
functions for posterior analysis, data storage, model checking, comparison and \
diagnostics."
LICENSE = "Apache-2.0"

PV = "0.15.1"

RPM_NAME = "python310-arviz-0.15.1-1.2.noarch.rpm"
RPM_HASH = "12afdf1716bccc5f2650160229d4932a6238b8275a52ec3f66f618e6ec5dc514ece5fd1e2e6f2af26a84fbbefd2c4cf5d38d80a04c3de3f6ea05b7c0f928a83a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-arviz python3.10dist(arviz) python310-arviz python3dist(arviz)"
RDEPENDS:${PN} += "python(abi) python310-h5netcdf python310-matplotlib python310-numpy python310-packaging python310-pandas python310-scipy python310-setuptools python310-typing_extensions python310-xarray python310-xarray-einstats"

inherit rpm
