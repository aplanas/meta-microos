SUMMARY = "A bespoke and simple Todo.txt client"
DESCRIPTION = "Write a to-do list that will be easy to sync with most known Todo.txt clients."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.5"

RPM_NAME = "yishu-1.2.5-1.16.aarch64.rpm"
RPM_HASH = "6332dce1dff8ca8ce95702a26a2c912199953f0526f169293a75bcbc539fb3bbeee14bc4bc13b96a18664f8f1f1c8621bd7f2b430c8a9d21f08250447a1272c6"

RPROVIDES:${PN} += "application() application(com.github.lainsce.yishu.desktop) metainfo() metainfo(com.github.lainsce.yishu.appdata.xml) yishu yishu(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk-3.so.0()(64bit) libgee-0.8.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgranite.so.6()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm
