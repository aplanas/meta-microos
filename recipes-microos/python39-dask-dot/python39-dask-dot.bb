SUMMARY = "Display dask graphs using graphviz"
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
This package contains the graphviz dot rendering interface."
LICENSE = "BSD-3-Clause"

PV = "2023.3.2"

RPM_NAME = "python39-dask-dot-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "f30db8953976b9ce5e832252c2d61007727b234ae51e05796edf025ee02d6c715f4a970a39cacc21b33cadae347163e5f3e531f5b03ee43947bd1e4de66ba334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-dask-dot"
RDEPENDS:${PN} += "graphviz graphviz-gd graphviz-gnome python(abi) python39-dask python39-graphviz"

inherit rpm
