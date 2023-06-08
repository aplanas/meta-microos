SUMMARY = "Jalali datetime binding for python"
DESCRIPTION = "jdatetime is the Jalali implementation of Python's datetime module."
LICENSE = "Python-2.0"

PV = "4.1.0"

RPM_NAME = "python39-jdatetime-4.1.0-1.4.noarch.rpm"
RPM_HASH = "bf5128317dd15a45a69193d95ca53dfac09d5dfa0bc93fc67add7a715309662db6cb0b02556d39066c9ba4e85b32ef0d7e9a53c31f347d221ec1ef1b1bdba4b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jdatetime) python39-jdatetime python3dist(jdatetime)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
