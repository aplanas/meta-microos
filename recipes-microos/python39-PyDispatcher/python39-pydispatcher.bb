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

RPM_NAME = "python39-PyDispatcher-2.0.6-1.3.noarch.rpm"
RPM_HASH = "97510294acae4f98b2f314ec7d07891c67d9cc2ff69a716a2f86c9d38df222e5fa76136d6918bce36b864d09f97aab6641dc8f1f69f090a39afe4689e6a2ab80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pydispatcher) python39-PyDispatcher python3dist(pydispatcher)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
