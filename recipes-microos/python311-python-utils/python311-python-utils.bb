SUMMARY = "Utilities not included with the standard Python install"
DESCRIPTION = "Python Utils is a collection of Python functions and \
classes which make common patterns shorter and easier."
LICENSE = "BSD-3-Clause"

PV = "3.4.5"

RPM_NAME = "python311-python-utils-3.4.5-1.3.noarch.rpm"
RPM_HASH = "17b4ab32c8e017b6a8b764c2671c53129e987dbeaba2d36d52c3d781f6b1e534ebcbb43466dcf4d7e98efdcb6268e90956eee4edddeb2ea70c9a59ca8d87db52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-utils) python311-python-utils python3dist(python-utils)"
RDEPENDS:${PN} += "python(abi) python311-loguru"

inherit rpm
