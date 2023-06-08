SUMMARY = "GDB pretty printers for the C++ standard library"
DESCRIPTION = "This package contains pretty printers for the C++ standard library usable \
from GDB."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "libstdc++6-pp-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "42ef4971737a2f2bacbeb2960083138f6dc5cd9d48522ed02aa8823e48eae28c01695289c95943033e7282911fbe2333872c81dcb6160ca2b26cd0a7370ddded"

RPROVIDES:${PN} += "libstdc++6-pp libstdc++6-pp-gcc11 libstdc++6-pp-gcc11(aarch-64)"
RDEPENDS:${PN} += "libstdc++6"

inherit rpm
