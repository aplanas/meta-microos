SUMMARY = "Delayed module for dask"
DESCRIPTION = "A flexible library for parallel computing in Python. \
 \
Dask is composed of two parts: \
- Dynamic task scheduling optimized for computation. This is similar to \
  Airflow, Luigi, Celery, or Make, but optimized for interactive \
  computational workloads. \
- “Big Data” collections like parallel arrays, dataframes, and lists that \
  extend common interfaces like NumPy, Pandas, or Python iterators to \
  larger-than-memory or distributed environments. These parallel collections \
  run on top of dynamic task schedulers. \
 \
This package contains the dask.delayed module"
LICENSE = "BSD-3-Clause"

PV = "2023.3.2"

RPM_NAME = "python311-dask-delayed-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "8e72fbb9130b7f2dec962241a0ad02996b9b7bda6f065cef238519bb534a64cccacba489d5b03d9cd9a8ff637c4a6f6723f1f087658fe2f4a3d24162bd00ed2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-dask-delayed"
RDEPENDS:${PN} += "python(abi) python311-dask"

inherit rpm
