SUMMARY = "A Unix shell embedded within Scheme"
DESCRIPTION = "Scsh is a Unix shell embedded in Scheme. It allows the user to write \
commands in a language within Scheme that follows the Unix way, but \
also allows to specify more complex commands with the elegance of \
Scheme."
LICENSE = "BSD-3-Clause"

PV = "0.7+git114432435e4eadd54334df6b37fcae505079b49f"

RPM_NAME = "scsh-0.7+git114432435e4eadd54334df6b37fcae505079b49f-7.3.aarch64.rpm"
RPM_HASH = "6e372e4dd40e06419528ef38cf9f1a96bfd83f62d4e15ffeb7557db66e0bfd3be1ffc8a8e76a6b34408e93843e35bf69a88511ab76707a3ecbe5137e03e3e9b7"

RPROVIDES:${PN} += "scsh scsh(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) scheme48-vm scsh-base"

inherit rpm
