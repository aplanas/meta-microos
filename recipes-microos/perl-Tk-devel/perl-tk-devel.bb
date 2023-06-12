SUMMARY = "Development files for perl-Tk"
DESCRIPTION = "Development files for Tk - a graphical user interface toolkit for Perl"
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & Zlib"

PV = "804.036"

RPM_NAME = "perl-Tk-devel-804.036-2.1.aarch64.rpm"
RPM_HASH = "758dcc6ed60fb51ffe96521003caa9f1c856d4cd0da4e7ab686d17e4b47971d69878cde692c4ea01ce2bdbdbcebbe3f01eed82ed4a97664caecdb4d58fcdc207"

RPROVIDES:${PN} += "perl-Tk-devel perl-Tk-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl perl-Tk"

inherit rpm
