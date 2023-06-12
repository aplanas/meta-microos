SUMMARY = "Development headers for libtfm1"
DESCRIPTION = "Contains development headers for libtfm1"
LICENSE = "SUSE-Public-Domain | WTFPL"

PV = "0.13.1"

RPM_NAME = "tomsfastmath-devel-0.13.1-1.7.aarch64.rpm"
RPM_HASH = "de32141a606e553c92a941b8db6c1c36380e49f98e87136f1c46784d6c23fdee5247d67750f69745dc285a9cb0f4dcfc8f35db32d4a01029623d41aaca714f9c"

RPROVIDES:${PN} += "pkgconfig(tomsfastmath) \
tomsfastmath-devel \
tomsfastmath-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtfm1"

inherit rpm
