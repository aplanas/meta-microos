SUMMARY = "Search Mailboxes for a Particular E-Mail"
DESCRIPTION = "Grepmail searches a normal, gzipped, bzipped, or tzipped mailbox for a \
given regular expression, and returns any e-mails that match that \
expression. Piped input is allowed and date restrictions are supported."
LICENSE = "GPL-2.0+"

PV = "5.3104"

RPM_NAME = "grepmail-5.3104-2.19.noarch.rpm"
RPM_HASH = "039e58ff28b8c41185fb504adc9ec78ddfcaa8955f9ca5cf8905f92185835abddc1cc0191b4a22bfb17fbd5f75adbbe524fd4f305eb049041dcfa22acf58ef91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grepmail"
RDEPENDS:${PN} += "/usr/bin/perl perl(:MODULE_COMPAT_5.36.0) perl(Date::Parse) perl(Mail::Mbox::MessageParser) perl(Time::Local)"

inherit rpm
