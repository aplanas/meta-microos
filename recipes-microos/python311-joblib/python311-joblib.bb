SUMMARY = "Module for using Python functions as pipeline jobs"
DESCRIPTION = "Joblib is a set of tools to provide lightweight pipelining in \
Python. In particular, joblib offers: \
 \
  1. transparent disk-caching of the output values and lazy re-evaluation \
     (memoize pattern) \
 \
  2. parallel computing \
 \
  3. logging and tracing of the execution \
 \
Joblib can handle large data and has specific optimizations for `numpy` arrays."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "python311-joblib-1.2.0-1.3.noarch.rpm"
RPM_HASH = "a956b6b95d157625161c36cef071a0969cf6061c33078c9c0d48ec435648713ade8284ee41de4a722ff144e749a4093c611431dd9bfe1e5678c3e1a87c16da15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(joblib) \
python311-joblib \
python3dist(joblib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
