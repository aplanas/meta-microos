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

RPM_NAME = "python310-dask-delayed-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "7b0871604878f8476f2744ce591639a0df395b870a195ae9a1e1c188a4223c0a64df3b4750bfd27962b45a8b6bc94de9730e6332c6958a11ae729f2a39518016"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-delayed python310-dask-delayed"
RDEPENDS:${PN} += "python(abi) python310-dask"

inherit rpm
