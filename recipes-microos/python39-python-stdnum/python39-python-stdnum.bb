SUMMARY = "Python module to handle standardized numbers and codes"
DESCRIPTION = "This library offers functions for parsing, validating and reformatting \
standard numbers and codes in various formats. \
 \
Apart from the validate() function, modules generally provide extra \
parsing, validation, formatting or conversion functions."
LICENSE = "LGPL-2.0-or-later"

PV = "1.17"

RPM_NAME = "python39-python-stdnum-1.17-1.8.noarch.rpm"
RPM_HASH = "64ad83c075f5bef1c4db773a5d4ed466a53e630f5d5f10aa8c8b4bf1bddcadfd525e2c8777b61d2937227e4500f66c2234b85cc62f68a303c93d56ce8d74d04a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-stdnum) python39-python-stdnum python3dist(python-stdnum)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
