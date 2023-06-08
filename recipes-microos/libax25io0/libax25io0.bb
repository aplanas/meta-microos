SUMMARY = "AX.25 data link layer protocol library"
DESCRIPTION = "Libraries for AX.25. AX.25 (Amateur X.25) is a data link layer \
protocol derived from the X.25 protocol suite and designed for use by \
amateur radio operators."
LICENSE = "LGPL-2.1+"

PV = "0.0.12~rc5"

RPM_NAME = "libax25io0-0.0.12~rc5-1.9.aarch64.rpm"
RPM_HASH = "04e213b53a87f61bb5e505c88ac536dbf8a610f11117ce59a2809f276b1513cce77e51c64c0dc616a0a8b4dba7d8f9545c7642035bb9043ebb80d32d1ace5d70"

RPROVIDES:${PN} += "libax25io.so.0()(64bit) libax25io0 libax25io0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libax25-common libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
