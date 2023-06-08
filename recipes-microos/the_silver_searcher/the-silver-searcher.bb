SUMMARY = "A code-searching tool similar to ack, but faster"
DESCRIPTION = "A code searching tool similar to ack, with a focus on speed."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "the_silver_searcher-2.2.0-3.4.aarch64.rpm"
RPM_HASH = "cce0a04d54837af886f6c8973b5be9d6dc5e40280d333c2d109338290fa8a4417c9e561140721af9f0503668c46b6077b109da311225995414586e759aca42f8"

RPROVIDES:${PN} += "the_silver_searcher the_silver_searcher(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libpcre.so.1()(64bit) libz.so.1()(64bit)"

inherit rpm
