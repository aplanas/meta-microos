SUMMARY = "Python module for writing code that modifies source code"
DESCRIPTION = "RedBaron is a Python library and tool to write code that modifies \
source code. This includes writing custom refactoring, generic \
refactoring, tools, IDE or directly modifying source code in \
IPython."
LICENSE = "LGPL-3.0-or-later"

PV = "0.9.2"

RPM_NAME = "python39-redbaron-0.9.2-3.14.noarch.rpm"
RPM_HASH = "121d98fcefd5becfcc7fd6a957a6da2c15ba6fee8b0077d54348f88d15eb726c05d2b79b18b3e2a460fa88b47ce25708f12c2f7236c0e3fca2acaee00fb7200c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(redbaron) python39-redbaron python3dist(redbaron)"
RDEPENDS:${PN} += "python(abi) python39-baron"

inherit rpm
