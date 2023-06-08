SUMMARY = "Tools for using a Web Server Gateway Interface stack"
DESCRIPTION = "These provide several pieces of 'middleware' (or filters) that can be nested \
to build web applications.  Each piece of middleware uses the WSGI (PEP 333) \
interface, and should be compatible with other middleware based on those \
interfaces."
LICENSE = "MIT"

PV = "3.5.2"

RPM_NAME = "python39-Paste-3.5.2-2.3.noarch.rpm"
RPM_HASH = "4b7035f57299cadeb6c557ae44fb0bd58e73d81c08116dffca3bddb4b3fb677f0aaaea93637dca03de45c6951eeded7daf442b102098f3d06acae4ff3b76f8db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(paste) python39-Paste python3dist(paste)"
RDEPENDS:${PN} += "python(abi) python39-six"

inherit rpm
