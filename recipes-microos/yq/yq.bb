SUMMARY = "A portable command-line YAML processor"
DESCRIPTION = "A lightweight and portable command-line YAML processor. yq uses jq like syntax \
but works with yaml files as well as json. It doesn't yet support everything \
jq does - but it does support the most common operations and functions, and more \
is being added continuously."
LICENSE = "MIT"

PV = "4.33.3"

RPM_NAME = "yq-4.33.3-1.2.aarch64.rpm"
RPM_HASH = "87d0f8b738eb775dcad076b9a60374162ed377af9138cef76c4f37512d006a633923af0cef3c702afb2a0e1398de1430ff7f07f82fef62fce03092cb549fbf66"

RPROVIDES:${PN} += "yq yq(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
