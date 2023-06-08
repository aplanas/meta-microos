SUMMARY = "Container registry command line client"
DESCRIPTION = "Container registry v2 command line client and repo listing generator \
with security checks. It can be used to get and manipulate several \
informations about container images, manifestes and layers from a \
container registry including vulnerability reports and can generate a \
static website for a registry."
LICENSE = "MIT"

PV = "0.16.1"

RPM_NAME = "reg-0.16.1-1.14.aarch64.rpm"
RPM_HASH = "09eaa460c54332b0e2f61c5f7603446e4d9c06717e9698795795953a5d2600bf5a9fce7a86e1dfe4a5477c1b0ee25aece0ff8d5c1c65386e6e43e3b8c4f9416f"

RPROVIDES:${PN} += "reg reg(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
