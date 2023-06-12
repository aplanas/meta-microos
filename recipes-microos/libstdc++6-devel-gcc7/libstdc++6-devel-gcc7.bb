SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all the headers and libraries of the standard C++ \
library. It is needed for compiling C++ code."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libstdc++6-devel-gcc7-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "6c66bc3fa11e62530dea2eb82b8f88226c65aa9428d49924198a9abbdf0e441b33131d9942464fda2f75593cbb2a39927485fbacdb94460553c9644c6767984d"

RPROVIDES:${PN} += "libstdc++6-devel-gcc7 \
libstdc++6-devel-gcc7(aarch-64)"
RDEPENDS:${PN} += "glibc-devel \
libstdc++6"

inherit rpm
