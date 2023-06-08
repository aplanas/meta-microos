SUMMARY = "Dependency package for python310-scipy_1_10_1-gnu-hpc"
DESCRIPTION = "python310-scipy: Scientific Tools for Python \
The package python310-scipy-gnu-hpc provides the dependency to get binary package python310-scipy_1_10_1-gnu-hpc. \
When this package gets updated it installs the latest version of python310-scipy_1_10_1-gnu-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.10.1"

RPM_NAME = "python310-scipy-gnu-hpc-1.10.1-2.4.aarch64.rpm"
RPM_HASH = "f45a405d0ec9061902b1f827664fc6a111152c7d11836264ed33f6612e5d2d144f29c828626d34bfddbfe6686f31945ded25cbb66e9e1f8d4db7ecfb0d5fda02"

RPROVIDES:${PN} += "python3-scipy-gnu-hpc python310-scipy-gnu-hpc python310-scipy-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh python310-scipy_1_10_1-gnu-hpc"

inherit rpm
