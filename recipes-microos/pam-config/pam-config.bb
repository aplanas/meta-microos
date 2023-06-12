SUMMARY = "Utility to modify common PAM configuration files"
DESCRIPTION = "pam-config is a command line utility to maintain the common PAM \
configuration files included by most PAM application configuration \
files. It can be used to configure a system for different network or \
hardware based authentication schemes. pam-config can also \
add/adjust/remove other PAM modules and their options."
LICENSE = "GPL-2.0-only"

PV = "2.5"

RPM_NAME = "pam-config-2.5-1.1.aarch64.rpm"
RPM_HASH = "dfd9c6b12c2fefccb86ca17789766367ed3b038f338531eba10db246e72041a06719676f9a9a66ea0ebcab99ffa3b457222f9c605f72b63caf88c884835309ab"

RPROVIDES:${PN} += "config(pam-config) \
pam-config \
pam-config(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
pam"

inherit rpm
