SUMMARY = "Multi-producer-multi-consumer signal dispatching mechanism"
DESCRIPTION = "Dispatcher mechanism for creating event models. \
 \
PyDispatcher is an enhanced version of Patrick K. O’Brien’s original \
dispatcher.py module. It provides the Python programmer with a robust \
mechanism for event routing within various application contexts. \
 \
Included in the package are the robustapply and saferef modules, which \
provide the ability to selectively apply arguments to callable objects and \
to reference instance methods using weak-references."
LICENSE = "BSD-3-Clause"

PV = "2.0.6"

RPM_NAME = "python310-PyDispatcher-2.0.6-1.3.noarch.rpm"
RPM_HASH = "dcc8f0b7f1b11a6fe55c3c7c56feae475d823a2f3708a69ef55b9f18b12ef4d3094fb7939a38cbb5d1286ac5dce1410386dca12d333e25ef46fcb252ebe89bb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyDispatcher python3.10dist(pydispatcher) python310-PyDispatcher python3dist(pydispatcher)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
