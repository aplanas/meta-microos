SUMMARY = "Module for determining appropriate platform-specific dirs"
DESCRIPTION = "A small Python module for determining appropriate platform-specific dirs, e.g. a 'user data dir'."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python39-platformdirs-3.2.0-2.1.noarch.rpm"
RPM_HASH = "74ca1ef4d3321117961857b7222f0cc43bcf66e90dda454ef409d69800f105e733f3e7e559fd4698eb6952efeacf8ba1d2fb46742b98a4a06c4743b298d090a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(platformdirs) python39-platformdirs python3dist(platformdirs)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
