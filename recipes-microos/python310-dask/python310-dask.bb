SUMMARY = "Minimal task scheduling abstraction"
DESCRIPTION = "A flexible library for parallel computing in Python. \
 \
Dask is composed of two parts: \
- Dynamic task scheduling optimized for computation. This is similar to \
  Airflow, Luigi, Celery, or Make, but optimized for interactive \
  computational workloads. \
- “Big Data” collections like parallel arrays, dataframes, and lists that \
  extend common interfaces like NumPy, Pandas, or Python iterators to \
  larger-than-memory or distributed environments. These parallel collections \
  run on top of dynamic task schedulers."
LICENSE = "BSD-3-Clause"

PV = "2023.3.2"

RPM_NAME = "python310-dask-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "57bc71c4bce88ef6eef5229c0a81530e2359c292e6ac705c01fe5134cec7f34904d8f744abfc344282343194ade33c613e6768290a5dccb9f7deccee8c4f1d8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask python3-dask-multiprocessing python3.10dist(dask) python310-dask python310-dask-multiprocessing python3dist(dask)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-PyYAML python310-click python310-cloudpickle python310-fsspec python310-importlib-metadata python310-packaging python310-partd python310-toolz update-alternatives"

inherit rpm
