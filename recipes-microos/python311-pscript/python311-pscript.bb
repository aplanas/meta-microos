SUMMARY = "Python to JavaScript compiler"
DESCRIPTION = "PScript is a Python to JavaScript compiler, and is also the name of the subset \
of Python that this compiler supports."
LICENSE = "BSD-2-Clause"

PV = "0.7.7"

RPM_NAME = "python311-pscript-0.7.7-1.4.noarch.rpm"
RPM_HASH = "a67f53f8f91d0dccd123f56683324d7a93256cb0ddf009581124a54ce8f75a606b9e0d9444bf4f9285679a1d3bd3ff74bc68505c4bea8b0f19881e8ab81fadd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pscript) python311-pscript python3dist(pscript)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
