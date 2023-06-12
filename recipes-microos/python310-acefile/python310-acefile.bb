SUMMARY = "ACE 1.0 and 2.0 archive reader/extractor in pure Python"
DESCRIPTION = "Read/test/extract ACE 1.0 and 2.0 archives in pure python."
LICENSE = "BSD-2-Clause"

PV = "0.6.12"

RPM_NAME = "python310-acefile-0.6.12-3.16.aarch64.rpm"
RPM_HASH = "a8cd17ca4cc89c014c83ecfc636346ea16c7ffcd9c9ac84d398686cc8b05616a24822e109231e4f150c7024f712a6bffebb78a1ef1301580eb25ac2e0a393048"

RPROVIDES:${PN} += "python3-acefile \
python3.10dist(acefile) \
python310-acefile \
python310-acefile(aarch-64) \
python3dist(acefile)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python310-setuptools \
update-alternatives"

inherit rpm
