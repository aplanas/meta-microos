SUMMARY = "Declarative Python programming using Parameters"
DESCRIPTION = "Param is a library providing Parameters: Python attributes extended to \
have features such as type and range checking, dynamically generated \
values, documentation strings, default values, etc., each of which is \
inherited from parent classes if not specified in a subclass. \
 \
Param contains only two required Python files, with no external \
dependencies, and is provided freely for both non-commercial and \
commercial use under a BSD license, so that it can easily be included \
as part of other projects."
LICENSE = "BSD-3-Clause"

PV = "1.13.0"

RPM_NAME = "python39-param-1.13.0-1.2.noarch.rpm"
RPM_HASH = "125a02c270538ddeb55739c2040100b195d4d6c63d94be702e94cdd591e15699610eb6f197040a45134cac3283409621398b4dd4ba82673930c885216d696f11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(param) \
python39-param \
python3dist(param)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
