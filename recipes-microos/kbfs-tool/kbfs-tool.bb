SUMMARY = "Keybase Filesystem command line utility"
DESCRIPTION = " \
A thin command line utility for interacting with the Keybase Filesystem \
without using a filesystem mountpoint."
LICENSE = "BSD-3-Clause"

PV = "6.0.2"

RPM_NAME = "kbfs-tool-6.0.2-3.3.aarch64.rpm"
RPM_HASH = "0352f0ebbd7a27d1ea90bcf12963914486c434826c1f1b2452ed0632363bc634e4d869a4dbc845e7f981f5e3d9004eee3af973f2efa8bb0986f17714caaa5473"

RPROVIDES:${PN} += "kbfs-tool kbfs-tool(aarch-64)"
RDEPENDS:${PN} += "keybase-client"

inherit rpm
