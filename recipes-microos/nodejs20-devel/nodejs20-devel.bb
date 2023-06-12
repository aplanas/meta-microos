SUMMARY = "Development headers for NodeJS 20.x"
DESCRIPTION = "This package provides development headers for Node.js needed for creation \
of binary modules."
LICENSE = "MIT"

PV = "20.2.0"

RPM_NAME = "nodejs20-devel-20.2.0-2.1.aarch64.rpm"
RPM_HASH = "c23d1086ed0f24d78a44f508b92ef5a1f2353accb2affed5ca5d5006acc00204c7c98a76c203ea1293953e4d5a1073157c0d5ebadd10f67ae5e75a8573a85501"

RPROVIDES:${PN} += "nodejs-devel nodejs20-devel nodejs20-devel(aarch-64)"
RDEPENDS:${PN} += "nodejs20 npm20"

inherit rpm
