SUMMARY = "Malcontent system library"
DESCRIPTION = "Libmalcontent implements parental controls support which can be \
used by applications to filter or limit the access of child \
accounts to inappropriate content."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.10.4"

RPM_NAME = "libmalcontent-0-0-0.10.4-1.5.aarch64.rpm"
RPM_HASH = "2db5b9866b0c26b424a05f6b59f41ee84548010e0dc1ee2bc1f594a38cdbf23e179c452fbf44286395bb24a4e7f92ea0342d8b3fb68707726f3a2697c9dbddc5"

RPROVIDES:${PN} += "libmalcontent-0-0 libmalcontent-0-0(aarch-64) libmalcontent-0.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) malcontent"

inherit rpm
