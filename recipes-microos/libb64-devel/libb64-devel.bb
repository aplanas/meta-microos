SUMMARY = "A library for working with base64 encoding/decoding"
DESCRIPTION = "libb64 is a library of ANSI C routines for fast encoding/decoding data into and \
from a base64-encoded format. C++ wrappers are included, as well as the source \
code for standalone encoding and decoding executables."
LICENSE = "SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "libb64-devel-1.2.1-3.12.aarch64.rpm"
RPM_HASH = "8c015e1d7baebaeae561d74fa7f7b6a4e4c48cca89f576ab1367b8bf5534c9ff5d93c9ffa70a2f47a3490922b5bb2114738007c16824c45ac087ae09cb85f982"

RPROVIDES:${PN} += "libb64-devel \
libb64-devel(aarch-64)"
RDEPENDS:${PN} += "libb64-0"

inherit rpm
