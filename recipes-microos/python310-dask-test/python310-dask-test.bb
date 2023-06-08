SUMMARY = "The test submodules of the python-dask package"
DESCRIPTION = "Dask is a flexible library for parallel computing in Python. \
This subpackage provides the .test submodules in the sitelib required for \
unit testing dask."
LICENSE = "BSD-3-Clause"

PV = "2023.3.2"

RPM_NAME = "python310-dask-test-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "4f99294d53f87ccdcf756f2ec15773a900acb842d0e9cc2f7783509a3191e74e824ce26463c129e5d56c47bdb339f05653f90d69928c68dd019f8fc8b52b318a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-test python310-dask-test"
RDEPENDS:${PN} += "python(abi) python310-dask-complete"

inherit rpm
