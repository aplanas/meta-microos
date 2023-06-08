SUMMARY = "Implementation of Microsoft's NTLMv1 authentication"
DESCRIPTION = "Libntlm provides routines to manipulate the structures used for the \
client end of Microsoft NTLMv1 authentication."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6"

RPM_NAME = "libntlm0-1.6-1.11.aarch64.rpm"
RPM_HASH = "a739549fa6373e63214b4263b39e12b6567f46d7dd6a300a48359a0abe60c5b39efa18b101c5cf8d3cd181d87bb37264363f30a5f7fad91dfaa98fc514277d14"

RPROVIDES:${PN} += "libntlm.so.0()(64bit) libntlm0 libntlm0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
