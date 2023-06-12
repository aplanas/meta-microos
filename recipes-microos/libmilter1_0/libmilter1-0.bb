SUMMARY = "BSD Sendmail Content Management API (milter)"
DESCRIPTION = "Sendmail's Content Management API (milter) provides third-party programs to \
access mail messages as they are being processed by the Mail Transfer Agent \
(MTA), allowing them to examine and modify message content and \
meta-information. Filtering policies implemented by Milter-conformant filters \
may then be centrally configured and composed in an end-user's MTA \
configuration file. \
 \
'sendmail' is a trademark of Sendmail, Inc."
LICENSE = "Sendmail"

PV = "8.17.1"

RPM_NAME = "libmilter1_0-8.17.1-9.1.aarch64.rpm"
RPM_HASH = "e29c03961760bc638e3ed107b988eb14cb40a7c64d616b75447fa32fe936be4a22846a5d762d3234538c7b6127fb5a298640d3fc05a8722e2c350a8b1bf3720e"

RPROVIDES:${PN} += "libmilter.so.1.0()(64bit) \
libmilter1_0 \
libmilter1_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
smtp_daemon"

inherit rpm
