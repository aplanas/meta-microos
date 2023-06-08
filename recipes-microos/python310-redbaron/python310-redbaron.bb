SUMMARY = "Python module for writing code that modifies source code"
DESCRIPTION = "RedBaron is a Python library and tool to write code that modifies \
source code. This includes writing custom refactoring, generic \
refactoring, tools, IDE or directly modifying source code in \
IPython."
LICENSE = "LGPL-3.0-or-later"

PV = "0.9.2"

RPM_NAME = "python310-redbaron-0.9.2-3.14.noarch.rpm"
RPM_HASH = "ea02eb8ebc066ccd1e395615ef868d7009acab41c735e3f0288161442d7f75c42d4358019a11bc26c54dd59a011a99a9268810738060745eaaa8a52e16837108"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-redbaron python3.10dist(redbaron) python310-redbaron python3dist(redbaron)"
RDEPENDS:${PN} += "python(abi) python310-baron"

inherit rpm
