SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.0.1+git7231"

RPM_NAME = "libm2pim18-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "5deedbba51aae41d7b1302fa6fa3dc729d84475f075a3a572dada085f9a89b2ebe313674af27238001516397f27bd8094b4a7e0d9933750f38ba24ba80c33e12"

RPROVIDES:${PN} += "libm2pim.so.18()(64bit) libm2pim18 libm2pim18(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
