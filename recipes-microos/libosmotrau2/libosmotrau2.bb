SUMMARY = "Osmocom GSM TRAU (E1/RTP) library"
DESCRIPTION = "This library implements the Transcoder and Rate Adaptation Unit (TRAU) for \
GSM systems. \
The TRAU enables the use of lower rates (32, 16 or 8 kbps) over the \
A-bis interface instead of the 64 kbps ISDN rate for which the Mobile \
Switching Center (MSC) is designed."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "libosmotrau2-1.3.0-1.4.aarch64.rpm"
RPM_HASH = "41f651e18bb001a0b3f96f788dcd648801a0d258714f629c0071b87b15790e3c57e32287e9c0d076b3fe7401bf3cdfa1a2af111e64fe18dba8edc534e38105a4"

RPROVIDES:${PN} += "libosmotrau.so.2()(64bit) libosmotrau2 libosmotrau2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbctoolbox.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libortp.so.15()(64bit) libosmocore.so.19()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
