SUMMARY = "All dask components"
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
This package pulls in all the optional dask components."
LICENSE = "BSD-3-Clause"

PV = "2023.3.2"

RPM_NAME = "python311-dask-complete-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "464789f4fd13a0afc579d506eaa9319f90dded81db04daecd76d255ada15973b91ff2739c7f0271b687189fa4391d0a1701d7cbc59364b143f5d897d72c20de8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-dask-all python311-dask-complete"
RDEPENDS:${PN} += "python311-dask python311-dask-array python311-dask-bag python311-dask-dataframe python311-dask-delayed python311-dask-diagnostics python311-dask-distributed python311-dask-dot python311-lz4 python311-pyarrow"

inherit rpm
