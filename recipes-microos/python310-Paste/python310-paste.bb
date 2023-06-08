SUMMARY = "Tools for using a Web Server Gateway Interface stack"
DESCRIPTION = "These provide several pieces of 'middleware' (or filters) that can be nested \
to build web applications.  Each piece of middleware uses the WSGI (PEP 333) \
interface, and should be compatible with other middleware based on those \
interfaces."
LICENSE = "MIT"

PV = "3.5.2"

RPM_NAME = "python310-Paste-3.5.2-2.3.noarch.rpm"
RPM_HASH = "67b26f2a8c1d5c77261207034231e7c78724d4f960490ac3a491086c7dd00339351f46abbc2533f7da4b1ea72c4cf5919da08f740b1e4813a56a352369776aaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Paste python3.10dist(paste) python310-Paste python3dist(paste)"
RDEPENDS:${PN} += "python(abi) python310-six"

inherit rpm
