SUMMARY = "Tools for using a Web Server Gateway Interface stack"
DESCRIPTION = "These provide several pieces of 'middleware' (or filters) that can be nested \
to build web applications.  Each piece of middleware uses the WSGI (PEP 333) \
interface, and should be compatible with other middleware based on those \
interfaces."
LICENSE = "MIT"

PV = "3.5.2"

RPM_NAME = "python311-Paste-3.5.2-2.3.noarch.rpm"
RPM_HASH = "a59c047315cfef154a6f935145243af96b61a233e7cfc8cd1b7456a356a738c03d926111399515c93a3d29f736bbb2ca2e13df57eb9c54cfffe8281084f9dd4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(paste) python311-Paste python3dist(paste)"
RDEPENDS:${PN} += "python(abi) python311-six"

inherit rpm
