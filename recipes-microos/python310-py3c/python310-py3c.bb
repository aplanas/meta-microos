SUMMARY = "Python compatibility headers"
DESCRIPTION = "py3c helps porting C extensions to Python 3. \
 \
It provides a guide, and a set of macros to facilitate porting \
and reduce boilerplate."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python310-py3c-1.4-1.2.noarch.rpm"
RPM_HASH = "bd0167e480037a3355059d2a26a45481042e69c69059dbee482cd26a3e1487b891edeb8cb6b4655e637f5d41942b2130956ee88da3445d6bade34befefbf90be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py3c python3.10dist(py3c) python310-py3c python3dist(py3c)"
RDEPENDS:${PN} += ""

inherit rpm
