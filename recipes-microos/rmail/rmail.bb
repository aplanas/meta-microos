SUMMARY = "Rmail of the BSD Sendmail"
DESCRIPTION = "Rmail interprets incoming mail received via uucp and passing the \
processed mail on to the MTA (e.g. sendmail)."
LICENSE = "Sendmail"

PV = "8.17.1"

RPM_NAME = "rmail-8.17.1-8.3.aarch64.rpm"
RPM_HASH = "1625a7a1d1cb23d4b047fbe17842fbe84234db5ec8f8ec6b4dd01774447ea54aeaf665cdd3fe8017c5ba262107e3bee4f8978f1036a1c475e5fdac6d8621089b"

RPROVIDES:${PN} += "rmail rmail(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit)"

inherit rpm
