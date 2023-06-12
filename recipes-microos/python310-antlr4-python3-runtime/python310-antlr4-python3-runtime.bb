SUMMARY = "ANTLR runtime for Python 3"
DESCRIPTION = "ANTLR (ANother Tool for Language Recognition) is a powerful parser generator for \
reading, processing, executing, or translating structured text or binary files. \
 \
This package contains the runtime for Python 3."
LICENSE = "BSD-3-Clause"

PV = "4.9.3"

RPM_NAME = "python310-antlr4-python3-runtime-4.9.3-1.6.noarch.rpm"
RPM_HASH = "d33d7bf618f3f89b6fb326a01b4f463f77f0e50e700630eaf9ff31849b6d21d090a561bddb63dac7c128226224b22f97aa2b52e25252dbb0157d6ed7d1d0b762"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-antlr4-python3-runtime \
python3.10dist(antlr4-python3-runtime) \
python310-antlr4-python3-runtime \
python3dist(antlr4-python3-runtime)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
