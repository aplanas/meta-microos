SUMMARY = "URI parsing, classification and composition"
DESCRIPTION = "URI parsing, classification and composition."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python311-uritools-4.0.0-1.3.noarch.rpm"
RPM_HASH = "4e0ea9d59a8558fef9f2b4f4617740ea76dbe3c0cfc2871edba0da48499ab5647639f5b12c6eca7a68e10c71437337a5ab2ea5e1c00334801f73e86e1c13fa49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(uritools) python311-uritools python3dist(uritools)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
