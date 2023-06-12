SUMMARY = "POSIX1e ACLs for python"
DESCRIPTION = "This is a C extension module for Python which \
implements POSIX ACLs manipulation. It is a wrapper on top \
of the systems's acl C library - see acl(5)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "python39-pylibacl-0.6.0-1.8.aarch64.rpm"
RPM_HASH = "4029677353244a0988fd77eb756ea02ed4964ed4d5a1954c03156dc307f82c37070d01e5cea9762358719664bee5ce8c9a0c74900a482575e75957cb250ff753"

RPROVIDES:${PN} += "python3.9dist(pylibacl) \
python39-pylibacl \
python39-pylibacl(aarch-64) \
python3dist(pylibacl)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libacl.so.1()(64bit) \
libacl.so.1(ACL_1.0)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
