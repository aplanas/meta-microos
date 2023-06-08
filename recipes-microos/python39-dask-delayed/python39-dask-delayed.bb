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

RPM_NAME = "python39-dask-delayed-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "d81a2106dcf06337c24eba6b6082ed83496e13e04e14724ffade91c0bb4e59365cc2a928b91f8f3ab6d7f1c19a862d3643c5ad5e6d1c572d3b8d475d47e4d43a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-dask-delayed"
RDEPENDS:${PN} += "python(abi) python39-dask"

inherit rpm
