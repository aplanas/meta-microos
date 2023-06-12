SUMMARY = "Job-based library to send email through an SMTP server"
DESCRIPTION = "KSMTP is a job based library to send email through an SMTP server."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "ksmtp-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "fa0cf8662a979dec93583b4b3162ecd270e5241c33b7cc3a48fb35a6864a547577dc288ad8537fbb1ec3e56fbebad35073fa1fff66eb30c9af3028fe2efb54b7"

RPROVIDES:${PN} += "ksmtp ksmtp(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
