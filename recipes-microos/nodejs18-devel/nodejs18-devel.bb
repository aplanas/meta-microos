SUMMARY = "Development headers for NodeJS 18.x"
DESCRIPTION = "This package provides development headers for Node.js needed for creation \
of binary modules."
LICENSE = "MIT"

PV = "18.16.0"

RPM_NAME = "nodejs18-devel-18.16.0-1.1.aarch64.rpm"
RPM_HASH = "f32d8653732e0dd15363ccf98f8ff6355d44d80a1a4f688fb303025fcc1d4774c7eff8f23b51c563c247dc0b45e2e32b738ff60fb7cc34613cfff9fa2c44a640"

RPROVIDES:${PN} += "nodejs-devel nodejs18-devel nodejs18-devel(aarch-64)"
RDEPENDS:${PN} += "nodejs18 npm18"

inherit rpm
