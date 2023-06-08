SUMMARY = "Logging integration for Click"
DESCRIPTION = "Integrates logging with click. \
*This is rather experimental.  See tests for usage for now.*"
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-click-log-0.4.0-1.6.noarch.rpm"
RPM_HASH = "3e25b0e73ce03daa6a83a93e9cc92e426e002d8524454c0b552a770f67f0bb780dc0b3e69e7a3517f262c58f2797f7d9c54565f039d506d783e15f1676fc8bf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(click-log) python39-click-log python3dist(click-log)"
RDEPENDS:${PN} += "python(abi) python39-click"

inherit rpm
