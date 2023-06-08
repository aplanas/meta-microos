SUMMARY = "Colourful, human-friendly hexdump tool"
DESCRIPTION = "hexd prints a human-readable hexdump of the specified files, or \
standard input if omitted. Its main distinguishing feature is \
the use of colours to visually indicate which range of values \
an octet belongs to, aiding in spotting patterns in binary data."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "hexd-1.1.0-1.6.aarch64.rpm"
RPM_HASH = "f37d21e080f3c1bae3119b37950ccf485a78b34267accb490fe4834026d1b954ce23d54e33f83e8cc96857535377b6a18a8bc2332515209ea2329a128275407b"

RPROVIDES:${PN} += "hexd hexd(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
