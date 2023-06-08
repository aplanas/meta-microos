SUMMARY = "Simply Sending Email"
DESCRIPTION = "This module provides a very simple, very clean, very specific interface to \
multiple Email mailers. The goal of this software is to be small and \
simple, easy to use, and easy to extend."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.201"

RPM_NAME = "perl-Email-Send-2.201-1.20.noarch.rpm"
RPM_HASH = "80e772eb7c293568cbb5a4021adb3abb1c6ad947401aa973e22816d24e61adcdc55a66390f506bee13c4d806d400c8c33dcebec9ba90bf297f4b31e76d43517f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Email::Send) perl(Email::Send::NNTP) perl(Email::Send::Qmail) perl(Email::Send::SMTP) perl(Email::Send::Sendmail) perl(Email::Send::Test) perl-Email-Send"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Email::Abstract) perl(Email::Address) perl(Email::Simple) perl(Module::Pluggable) perl(Return::Value)"

inherit rpm
