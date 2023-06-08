SUMMARY = "Web safe object pickling/unpickling"
DESCRIPTION = "The rencode module is a modified version of bencode from the \
BitTorrent project.  For complex, heterogeneous data structures with \
many small elements, r-encodings take up significantly less space than \
b-encodings. Python2 version of package"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.6"

RPM_NAME = "python310-rencode-1.0.6-1.23.aarch64.rpm"
RPM_HASH = "9871f1540539adbe747efc3557ffd44a3004cc825cdea589005dd6467529fc2441c9b11bca21005282caf3d80a3861032e3148f636cd6bfbd02881498d83c265"

RPROVIDES:${PN} += "python3-rencode python3.10dist(rencode) python310-rencode python310-rencode(aarch-64) python3dist(rencode)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
