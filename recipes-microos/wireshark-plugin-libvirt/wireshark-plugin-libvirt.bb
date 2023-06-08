SUMMARY = "Wireshark plugin for libvirt RPC protocol"
DESCRIPTION = "Wireshark dissector plugin for better analysis of libvirt RPC traffic."
LICENSE = "LGPL-2.1-or-later"

PV = "9.3.0"

RPM_NAME = "wireshark-plugin-libvirt-9.3.0-1.1.aarch64.rpm"
RPM_HASH = "69521798bce869bdcaa7890ff92b4875c56c288342e1358bf212d5d155504e88f49a7547f41b4a75dd00645fd0c906b71560b92d8d70af93a42d525d0aeddcf5"

RPROVIDES:${PN} += "libvirt.so()(64bit) wireshark-plugin-libvirt wireshark-plugin-libvirt(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libtirpc.so.3()(64bit) libtirpc.so.3(TIRPC_0.3.0)(64bit) libvirt-libs libwireshark.so.16()(64bit) wireshark"

inherit rpm
