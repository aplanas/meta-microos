SUMMARY = "Interface with the distributed task scheduler in dask"
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
This meta package pulls in the distributed module into the dask namespace."
LICENSE = "BSD-3-Clause"

PV = "2023.3.2"

RPM_NAME = "python311-dask-distributed-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "8140108fa81a924851a82b478863bbca8e0be92f568d39629d70716978f5d4343cfaddf30366805e46613172736177ad1fe4b5111a094ef97007b67769f04cb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-dask-distributed"
RDEPENDS:${PN} += "python311-dask \
python311-distributed"

inherit rpm
