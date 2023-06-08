SUMMARY = "Job-based library to send email through an SMTP server"
DESCRIPTION = "KSMTP is a job based library to send email through an SMTP server."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "ksmtp-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "89c81a24ed0902ce8fda9e2a5f65264ff72db7a911e4c6ab100e197b76fee0145e3aa4a8b252bf5b9f3b0694d609d192a1a4ebaaf8842a0a2bc20f6e29545ee6"

RPROVIDES:${PN} += "ksmtp ksmtp(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
