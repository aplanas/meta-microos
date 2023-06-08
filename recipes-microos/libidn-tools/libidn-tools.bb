SUMMARY = "Command line utility to convert Int. Domain Names"
DESCRIPTION = "GNU Libidn is an implementation of the Stringprep, Punycode, and IDNA \
specifications defined by the IETF Internationalized Domain Names \
(IDN) working group. It is used to prepare internationalized strings \
(such as domain name labels, usernames, and passwords) in order to \
increase the likelihood that string input and string comparison work \
in ways that make sense for typical users around the world. The \
library contains a generic Stringprep implementation that does \
Unicode 3.2 NFKC normalization, mapping and prohibition of \
characters, and bidirectional character handling. Profiles for iSCSI, \
Kerberos 5, Nameprep, SASL, and XMPP are included. Punycode and ASCII \
Compatible Encoding (ACE) via IDNA is supported."
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-or-later) & GPL-3.0-or-later"

PV = "1.41"

RPM_NAME = "libidn-tools-1.41-1.2.aarch64.rpm"
RPM_HASH = "ac3ddd79d3f3bde00b314fe81d475010f2597e2988517f59110221e8abcf059cce804d95c699691f5aab29a617aff49faed8bf5f351fc1b8315d41a019da6ac8"

RPROVIDES:${PN} += "libidn-tools libidn-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libidn.so.12()(64bit) libidn.so.12(LIBIDN_1.0)(64bit)"

inherit rpm
