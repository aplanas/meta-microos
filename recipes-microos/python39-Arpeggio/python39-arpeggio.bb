SUMMARY = "Packrat parser interpreter"
DESCRIPTION = "Arpeggio is a recursive descent parser with memoization based on PEG grammars \
(aka Packrat parser). \
 \
For a higher level parsing/language tool (i.e., a nicer interface to \
Arpeggio) see textX"
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-Arpeggio-2.0.0-3.3.noarch.rpm"
RPM_HASH = "bc8ec7a0e5fd48124e6975ec7a9aa9ea3805b460dfda1bfc2f540a6fc5e321737b252e282802341723b876c382bb0f3ef1224764b018d9183c095b4b042b2cfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(arpeggio) python39-Arpeggio python3dist(arpeggio)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
