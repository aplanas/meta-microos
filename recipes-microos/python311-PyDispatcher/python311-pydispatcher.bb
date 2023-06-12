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

PV = "2.0.7"

RPM_NAME = "python311-PyDispatcher-2.0.7-1.1.noarch.rpm"
RPM_HASH = "b479cb4e0b1b634a9e719ced3c8a973064bc0df1074028ac9b32f4e18d6e94f584129efa422a9f6fe5031645c3cec3658171a93791a15f82da34553c427d0eaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pydispatcher) python311-PyDispatcher python3dist(pydispatcher)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
