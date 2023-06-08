SUMMARY = "Pandas-like DataFrame data structure for dask"
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
This package contains the dask DataFrame class. \
 \
A Dask DataFrame is a large parallel dataframe composed of many \
smaller Pandas dataframes, split along the index. These pandas \
dataframes may live on disk for larger-than-memory computing \
on a single machine, or on many different machines in a cluster."
LICENSE = "BSD-3-Clause"

PV = "2023.3.2"

RPM_NAME = "python310-dask-dataframe-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "247aac017cd6b728d4c33e39a333a4f596c05d77f9348726d4b7d923b3a376c11885d672a08bec26ea628c24a3f43c0f415b0d70e2d94afdb9ac2a1734a373f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-dataframe python310-dask-dataframe"
RDEPENDS:${PN} += "python(abi) python310-dask python310-dask-array python310-dask-bag python310-numpy python310-pandas"

inherit rpm
