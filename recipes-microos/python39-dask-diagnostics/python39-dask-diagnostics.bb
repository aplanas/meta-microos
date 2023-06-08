SUMMARY = "Diagnostics for dask"
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
This package contains the dask.diagnostics module"
LICENSE = "BSD-3-Clause"

PV = "2023.3.2"

RPM_NAME = "python39-dask-diagnostics-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "47d7d3750007d71d843b441c1287fd89b63407b4158e93d3b4460ddda396942688107a0f9acdcd86ab40e3e676a82a1161841d9c50e8372a453858292732742b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-dask-diagnostics"
RDEPENDS:${PN} += "(python39-bokeh >= 2.4.2 with python39-bokeh < 3) python(abi) python39-Jinja2 python39-dask"

inherit rpm
