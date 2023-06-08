SUMMARY = "Utilities for reading Windows Minidump files"
DESCRIPTION = "This subpackage contains the utility programs from libmdmp to \
read Windows Minidump files."
LICENSE = "LGPL-3.0-or-later"

PV = "20210420"

RPM_NAME = "libmdmp-tools-20210420-3.4.aarch64.rpm"
RPM_HASH = "f01740e5f2944f13f68a86a3d55f326fe3fb7bdef13827e1fcf500e91b60ce214f01ddb0ef022eb56d269c59a211358f35d933c03ef15870637e09ddf9f12f4b"

RPROVIDES:${PN} += "libmdmp-tools libmdmp-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libmdmp.so.1()(64bit) libmdmp.so.1(V_20210420)(64bit)"

inherit rpm
