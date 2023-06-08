SUMMARY = "Python timeout decorator"
DESCRIPTION = "Python timeout decorator."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python39-timeout-decorator-0.4.1-1.10.noarch.rpm"
RPM_HASH = "ff233c46ca32c2a5724440e5862750dd9243d76947873227c19053e3cc82a3b4cd0b4c4a440b7ab0ab50eeb7dd6b1e5596bea39daa373c083923341b8872ff33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(timeout-decorator) python39-timeout-decorator python3dist(timeout-decorator)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
