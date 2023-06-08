SUMMARY = "A Library for Working with Strong Hashes"
DESCRIPTION = "The mhash library provides an easy way to access strong hashes, such as \
MD5, SHA1, and other algorithms."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.9.9"

RPM_NAME = "libmhash2-0.9.9.9-31.5.aarch64.rpm"
RPM_HASH = "01242ec2b60aa0dc478279e2dc85db652acfb6ef07178d3e95e7cc737628d354847f21c89150dc2ce2732421b7fb52c7564415f651db7396722848d361e0ed8f"

RPROVIDES:${PN} += "libmhash.so.2()(64bit) libmhash2 libmhash2(aarch-64) mhash"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
