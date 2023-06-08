SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all the headers and libraries of the standard C++ \
library. It is needed for compiling C++ code."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "11.3.1+git2076"

RPM_NAME = "libstdc++6-devel-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "bcbba2567ffe270649e8ec0448f6b153b087a7dd58afe620ea6175d6ad13ecf8c4102549d4378cad94b507f9b5a153ec12d0638c86a1b90048de3f91f06ceeda"

RPROVIDES:${PN} += "libstdc++6-devel-gcc11 libstdc++6-devel-gcc11(aarch-64)"
RDEPENDS:${PN} += "glibc-devel libstdc++6"

inherit rpm
