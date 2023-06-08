SUMMARY = "GDB pretty printers for the C++ standard library"
DESCRIPTION = "This package contains pretty printers for the C++ standard library usable \
from GDB."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "libstdc++6-pp-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "f4d12e579e7c93ffc64878d17cf0955f06716043da0e4577f69a239ebdf96d9e253a4d878ae6edc354590c56496e47b67467021fdd1c6129031da0a9fd286c81"

RPROVIDES:${PN} += "libstdc++6-pp libstdc++6-pp(aarch-64) libstdc++6-pp-gcc10 libstdc++6-pp-gcc11 libstdc++6-pp-gcc9"
RDEPENDS:${PN} += "libstdc++6"

inherit rpm
