SUMMARY = "Distributed Compile Wrappers for Clang"
DESCRIPTION = "Wrapper symlinks for clang/clang++ for icecream distributed building."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "icecream-clang-wrappers-1.4.0-2.5.aarch64.rpm"
RPM_HASH = "44b31e97db4ab93816fa5baca1fc312c4b362aaa4d2d401d4e9e15522cfb648e14ab4b6ffefca141d7380ee329c4bd796a182cbaf0bf67c07b0635db6f22db42"

RPROVIDES:${PN} += "icecream-clang-wrappers \
icecream-clang-wrappers(aarch-64)"
RDEPENDS:${PN} += "clang \
icecream"

inherit rpm
