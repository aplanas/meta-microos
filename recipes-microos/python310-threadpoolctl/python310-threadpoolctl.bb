SUMMARY = "Thread-pool Controls"
DESCRIPTION = "Python helpers to limit the number of threads used in native \
libraries that handle their own internal threadpool (BLAS \
and OpenMP implementations)."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python310-threadpoolctl-3.1.0-2.1.noarch.rpm"
RPM_HASH = "fca41884ccff8732d012e4af5e311fa4e220d2e68c4920e0df02de45342109068d40ee98f8c859cfbe55d15fd2b4654bec5704cf5feda7bfd75df1f181cacebc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-threadpoolctl python3.10dist(threadpoolctl) python310-threadpoolctl python3dist(threadpoolctl)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
