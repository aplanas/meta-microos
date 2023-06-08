SUMMARY = "Data structure generic python objects in dask"
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
This package contains the dask bag class. \
 \
Dask.Bag parallelizes computations across a large collection of \
generic Python objects. It is particularly useful when dealing \
with large quantities of semi-structured data like JSON blobs \
or log files."
LICENSE = "BSD-3-Clause"

PV = "2023.3.2"

RPM_NAME = "python311-dask-bag-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "ea61a6301fdafbbbb1fdb1c31323817e7d75b667d38e61afb70be8b7edb9e33a864da57cc4e70b5bdcb652efea01cc1e8bea6301068a3253c12c42a0c73b990e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-dask-bag"
RDEPENDS:${PN} += "python(abi) python311-dask"

inherit rpm
