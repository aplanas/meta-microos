SUMMARY = "Development files for mingw32-winpthreads"
DESCRIPTION = "mingw-w64's implementation of POSIX threads for Windows."
LICENSE = "BSD-3-Clause & MIT"

PV = "10.0.0"

RPM_NAME = "mingw32-winpthreads-devel-10.0.0-1.6.noarch.rpm"
RPM_HASH = "32d95e386dc25d92c720c16f93ea0c97dd8c1140d86f584636878e2b791e675953f2a041d48ba91b77497f8d8d64d879b88dc86b01f262e1a8bb549a904de28c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32(lib:pthread) \
mingw32(lib:winpthread) \
mingw32-unistd-pthread-devel \
mingw32-winpthreads-devel"
RDEPENDS:${PN} += "mingw32-libwinpthread1"

inherit rpm
