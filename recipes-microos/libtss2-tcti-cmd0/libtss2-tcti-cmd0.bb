SUMMARY = "TCTI cmd interface library"
DESCRIPTION = "A TCTI for interaction with a subprocess. It abstracts the details of direct \
communication with the interface and protocol exposed by a subprocess that can \
receive and transmit raw TPM2 command and response buffers."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-tcti-cmd0-4.0.1-1.3.aarch64.rpm"
RPM_HASH = "12a4c418dc1a265b34e128a899c6f29a0d4ca278cd687e1f96568006a3be6be454d5413bec4cdc35c73be7457381014b33a2a25a2df76bbf5dcc47f6f02ac445"

RPROVIDES:${PN} += "libtss2-tcti-cmd.so.0()(64bit) libtss2-tcti-cmd0 libtss2-tcti-cmd0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libtss2-mu.so.0()(64bit)"

inherit rpm
