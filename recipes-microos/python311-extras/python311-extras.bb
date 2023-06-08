SUMMARY = "Extra bits for Python"
DESCRIPTION = "extras is a set of extensions to the Python standard library, originally \
written to make the code within testtools cleaner, but now split out for \
general use outside of a testing context."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-extras-1.0.0-6.1.noarch.rpm"
RPM_HASH = "d37739aa5ddf480bdf7405b0dd4005c9b4cb0151fb9df82275c8c9a626d57f6bb3bf899dcb9b3a5ca667175ac1ffad321b675a52b1f88473dc6d5ee296127b1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(extras) python311-extras python3dist(extras)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
