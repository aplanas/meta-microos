SUMMARY = "Pure-Python Git Library"
DESCRIPTION = "Simple Pure-Python implementation of the Git file formats and protocols. Dulwich \
is the place where Mr. and Mrs. Git live in one of the Monty Python sketches."
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "0.21.5"

RPM_NAME = "python310-dulwich-0.21.5-1.1.aarch64.rpm"
RPM_HASH = "0417996ee3d8428b49e91af80e5fc96098cdec7d687c684e64e62fd5879bc5efb8f61710f98a6840ed84f5cd8824bd73bbc238aaa80dde1ef602295b817333bf"

RPROVIDES:${PN} += "python3-dulwich \
python3.10dist(dulwich) \
python310-dulwich \
python310-dulwich(aarch-64) \
python3dist(dulwich)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python310-urllib3 \
update-alternatives"

inherit rpm
