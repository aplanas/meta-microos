SUMMARY = "(DEPRECATED) module for sending mails with attachments through an SMTP server"
DESCRIPTION = "Mail::Sender is deprecated. Email::Sender is the go-to choice when you need \
to send Email from Perl. Go there, be happy! \
 \
Mail::Sender provides an object-oriented interface to sending mails. It \
directly connects to the mail server using IO::Socket."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.903"

RPM_NAME = "perl-Mail-Sender-0.903-1.23.noarch.rpm"
RPM_HASH = "fe5a96b20a4a24130e33f607c388ce2e6ed975f4e4b99df4796d9f017e03c6d663fbbdfa6fc360241311e484944ea77dc0ea998def872d153179bdc525793dd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Mail::Sender) perl(Mail::Sender::CType::Ext) perl(Mail::Sender::CType::Win32) perl-Mail-Sender"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
