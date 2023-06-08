SUMMARY = "A portable command-line YAML processor"
DESCRIPTION = "A lightweight and portable command-line YAML processor. yq uses jq like syntax \
but works with yaml files as well as json. It doesn't yet support everything \
jq does - but it does support the most common operations and functions, and more \
is being added continuously."
LICENSE = "MIT"

PV = "4.33.3"

RPM_NAME = "yq-4.33.3-1.1.aarch64.rpm"
RPM_HASH = "37f00f54d2dcfeabb35f1991b107b5c7c6d9b07ac84a1c107e8baf0860c008475265c052d0738e667b0684b24d46eb54319c8d2e5dd3602e1af1f796245fbeae"

RPROVIDES:${PN} += "yq yq(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
