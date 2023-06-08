SUMMARY = "Python module to handle standardized numbers and codes"
DESCRIPTION = "This library offers functions for parsing, validating and reformatting \
standard numbers and codes in various formats. \
 \
Apart from the validate() function, modules generally provide extra \
parsing, validation, formatting or conversion functions."
LICENSE = "LGPL-2.0-or-later"

PV = "1.17"

RPM_NAME = "python311-python-stdnum-1.17-1.8.noarch.rpm"
RPM_HASH = "4d21f4bcb75ee36a8647d83314f16ec0af0bb5af8af76c5baaa8cca1bb715d6eb0ce6f60208663f8613d2af99f65a295c07ce07e29fdb89c6af5932ccab59ece"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-stdnum) python311-python-stdnum python3dist(python-stdnum)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
