SUMMARY = "A pthreads implementation for Windows"
DESCRIPTION = "mingw-w64's implementation of POSIX threads for Windows."
LICENSE = "BSD-3-Clause & MIT"

PV = "10.0.0"

RPM_NAME = "mingw64-libwinpthread1-10.0.0-1.6.noarch.rpm"
RPM_HASH = "68d88597d4535ba268d485eda54279e2042b6cf184c84d7efd486d317da4d10e02735dc5bb7189e3f7f94da06e9cf58a1bc4d0224c9cec8e3eb55105c0304b73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64(libwinpthread-1.dll) mingw64-libwinpthread1"
RDEPENDS:${PN} += ""

inherit rpm
