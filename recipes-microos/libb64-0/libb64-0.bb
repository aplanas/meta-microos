SUMMARY = "A library for working with base64 encoding/decoding"
DESCRIPTION = "libb64 is a library of ANSI C routines for fast encoding/decoding data into and \
from a base64-encoded format. C++ wrappers are included, as well as the source \
code for standalone encoding and decoding executables."
LICENSE = "SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "libb64-0-1.2.1-3.12.aarch64.rpm"
RPM_HASH = "168535474f932e1485ced3d898b894fbb5f84f957ac51588127298db359ac0d0d8538d4451b8289f00db383b78d4fd35ee3b16810b1a71a7b2ef41208266cbc8"

RPROVIDES:${PN} += "libb64-0 \
libb64-0(aarch-64) \
libb64.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
