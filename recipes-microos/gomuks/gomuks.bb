SUMMARY = "A terminal Matrix client written in Go"
DESCRIPTION = "A terminal Matrix client written in Go using mautrix and mauview. \
 \
Basic usage is possible, but expect bugs and missing features."
LICENSE = "AGPL-3.0-only"

PV = "0.3.0"

RPM_NAME = "gomuks-0.3.0-2.3.aarch64.rpm"
RPM_HASH = "9e3555213e93b0837bb553040fbb8d6ed673e073df61820a5595efd33f82ddca037590e643a9151d09c1b25afaadf710f6a85040b1f7b1340dcf25a27d9b1c78"

RPROVIDES:${PN} += "gomuks gomuks(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libolm.so.3()(64bit)"

inherit rpm
