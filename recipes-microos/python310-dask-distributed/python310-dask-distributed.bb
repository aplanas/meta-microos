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

RPM_NAME = "python310-dask-distributed-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "f38cacd336ec35c07ab2720c5f572a885c31e978fdcdfd5eda915fdbbdc72249240013eef11effa9d52290359a50a906d4f46b9b761f53b033c2934f850fde56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-distributed \
python310-dask-distributed"
RDEPENDS:${PN} += "python310-dask \
python310-distributed"

inherit rpm
