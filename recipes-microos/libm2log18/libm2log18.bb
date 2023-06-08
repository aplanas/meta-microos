SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.0.1+git7231"

RPM_NAME = "libm2log18-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "9f2b1e921e5251ba40cbbeaab38c9802b022d7d0f848119bddec7299549bed300daae8217ef381951a46c0840273d81f375d880f470139a86dff49a5667921a5"

RPROVIDES:${PN} += "libm2log.so.18()(64bit) libm2log18 libm2log18(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
