SUMMARY = "Prints the linux logo on the text console"
DESCRIPTION = "The Linux logo on the text console, with colors and system information. \
Contains a number of built-in logos."
LICENSE = "GPL-2.0-only"

PV = "6.0"

RPM_NAME = "linux_logo-6.0-2.6.aarch64.rpm"
RPM_HASH = "de604d097ad4ffe1639aef03bdf915d6eb1bb233a8d8d9aabd365593128f10e8e23a510e6138c49c5f9d02b0592e410e07d10e6b88832d7d18f0ae4690c25c24"

RPROVIDES:${PN} += "linux_logo linux_logo(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
