SUMMARY = "Mail and News Server"
DESCRIPTION = "Software to set up electronic mail and message services to handle email, mailing, and news lists, including a virus scanner to scan messages at the server level."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-mail_server-20210330-4.1.aarch64.rpm"
RPM_HASH = "4b2c6382ec371ba3a9535997176d97612cf0dd07a37756f4127f0638a7da9079cf46de4e85311372fb84ef84abc87291da1f84494caa2b3e8a3f9309053681ae"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-openSUSE-mail_server patterns-server-mail_server patterns-server-mail_server(aarch-64)"
RDEPENDS:${PN} += "pattern() vacation"

inherit rpm
