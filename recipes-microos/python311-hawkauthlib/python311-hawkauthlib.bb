SUMMARY = "Hawk Access Authentication protocol"
DESCRIPTION = "hawkauthlib is a low-level library for implementing Hawk Access Authentication, a \
simple HTTP request-signing scheme described in:https://npmjs.org/package/hawk"
LICENSE = "MPL-2.0"

PV = "2.0.0"

RPM_NAME = "python311-hawkauthlib-2.0.0-5.8.noarch.rpm"
RPM_HASH = "4f76a221db1176f3c7824be102f316bcbcbe14deb6aa6ea6113465bc82665d5f068951039cc0fe8920cb1b87450f2560720e5e2ce3cd1e8a4560c7f551a327d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hawkauthlib) python311-hawkauthlib python3dist(hawkauthlib)"
RDEPENDS:${PN} += "python(abi) python311-WebOb"

inherit rpm
