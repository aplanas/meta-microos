SUMMARY = "Thread-pool Controls"
DESCRIPTION = "Python helpers to limit the number of threads used in native \
libraries that handle their own internal threadpool (BLAS \
and OpenMP implementations)."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python311-threadpoolctl-3.1.0-2.1.noarch.rpm"
RPM_HASH = "2b569df6ebe85ef72db17e379acdd1819d6035a1082268c3cfbd8e67fe5d5455af28f77d98903dfe8ba67d3287914c0484cb8001d0493f2dac98867a65522e6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(threadpoolctl) \
python311-threadpoolctl \
python3dist(threadpoolctl)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
