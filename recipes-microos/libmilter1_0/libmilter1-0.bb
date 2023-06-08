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

RPM_NAME = "libmilter1_0-8.17.1-8.3.aarch64.rpm"
RPM_HASH = "36feb44c9d8c8b7396ccf755fb0050469dc2e55a1c864ae2d579585d9f146bb130b1415af53cebd7766b744730ca8325c67edaa00d6f501428f0dc9e758fb21f"

RPROVIDES:${PN} += "libmilter.so.1.0()(64bit) libmilter1_0 libmilter1_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) smtp_daemon"

inherit rpm
