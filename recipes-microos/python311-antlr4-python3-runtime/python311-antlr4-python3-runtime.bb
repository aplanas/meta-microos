SUMMARY = "ANTLR runtime for Python 3"
DESCRIPTION = "ANTLR (ANother Tool for Language Recognition) is a powerful parser generator for \
reading, processing, executing, or translating structured text or binary files. \
 \
This package contains the runtime for Python 3."
LICENSE = "BSD-3-Clause"

PV = "4.9.3"

RPM_NAME = "python311-antlr4-python3-runtime-4.9.3-1.6.noarch.rpm"
RPM_HASH = "11c8f4aa4255c8cbb73d8f7370db4d20ff05192bea5b0054e49f3541af82894debe50407b00c27d0868d975b39e5ffe3f67ce74fa68822882c8ead4c098c601a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(antlr4-python3-runtime) python311-antlr4-python3-runtime python3dist(antlr4-python3-runtime)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
