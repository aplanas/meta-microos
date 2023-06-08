SUMMARY = "Python module for writing code that modifies source code"
DESCRIPTION = "RedBaron is a Python library and tool to write code that modifies \
source code. This includes writing custom refactoring, generic \
refactoring, tools, IDE or directly modifying source code in \
IPython."
LICENSE = "LGPL-3.0-or-later"

PV = "0.9.2"

RPM_NAME = "python311-redbaron-0.9.2-3.14.noarch.rpm"
RPM_HASH = "6f61281338c8c80e12cad3b8ffc6293503b745a872e316cafe8be1fdb6a8a172ba8da8c1fe26ab9ffa3c66d3040a6365376ed8f3d772702cb9fecb05aab5d91d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(redbaron) python311-redbaron python3dist(redbaron)"
RDEPENDS:${PN} += "python(abi) python311-baron"

inherit rpm
