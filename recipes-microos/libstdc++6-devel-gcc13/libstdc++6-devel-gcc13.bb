SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all the headers and libraries of the standard C++ \
library. It is needed for compiling C++ code."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "13.0.1+git7231"

RPM_NAME = "libstdc++6-devel-gcc13-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "d67803a7b70e182cec7b8fdc21ccffd6b81770127d608390effae778ffb3406b459d7648f4df6f4ee5f62dec3c4a8e8ef66814654b9abe935ce4f4284335f471"

RPROVIDES:${PN} += "libstdc++6-devel-gcc13 libstdc++6-devel-gcc13(aarch-64)"
RDEPENDS:${PN} += "glibc-devel libstdc++6"

inherit rpm
