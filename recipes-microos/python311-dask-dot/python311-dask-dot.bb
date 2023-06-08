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

RPM_NAME = "python311-dask-dot-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "e43baa2d2a2ca0dd02f203920640055ea5c1e289afa2793f9c5e68ffbae0f9ae8069e7c0105f945241838c61fe01e8bd968f98d4cab2f45ec5dda5a9271d6ded"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-dask-dot"
RDEPENDS:${PN} += "graphviz graphviz-gd graphviz-gnome python(abi) python311-dask python311-graphviz"

inherit rpm
