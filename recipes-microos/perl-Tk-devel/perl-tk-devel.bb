SUMMARY = "Development files for perl-Tk"
DESCRIPTION = "Development files for Tk - a graphical user interface toolkit for Perl"
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & Zlib"

PV = "804.036"

RPM_NAME = "perl-Tk-devel-804.036-1.12.aarch64.rpm"
RPM_HASH = "19eb399d1506f03f178861e847800ed1dc6159635c68783077a9d5f07b4c7841359fa4e2c8a125b14003ec266d8e54f4743b11c37064857db7ba63bb6b66f412"

RPROVIDES:${PN} += "perl-Tk-devel perl-Tk-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl perl-Tk"

inherit rpm
