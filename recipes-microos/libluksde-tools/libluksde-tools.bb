SUMMARY = "Tools to access the New Technology File System (NTFS)"
DESCRIPTION = "libluksde-tools is a project to access LUKS Disk Encrypted volumes."
LICENSE = "LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "libluksde-tools-20221103-3.9.aarch64.rpm"
RPM_HASH = "15cca15ea07cadccf3e3d89e3bea6e9ded2a4b23dc8cc87575c710aef2e1e4b83cb1ab155f32e36588449748541723ab61ce5136d074689681d2d6374ddcc610"

RPROVIDES:${PN} += "libluksde-tools libluksde-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcdata.so.1()(64bit) libcdata.so.1(V_20230108)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libfguid.so.1()(64bit) libfguid.so.1(V_20220113)(64bit) libluksde.so.1()(64bit) libluksde.so.1(V_20221103)(64bit)"

inherit rpm
