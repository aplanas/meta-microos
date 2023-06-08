SUMMARY = "Check that a library is available"
DESCRIPTION = "Devel::CheckLib is a perl module that checks whether a particular C library \
and its headers are available."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.16"

RPM_NAME = "perl-Devel-CheckLib-1.16-1.6.aarch64.rpm"
RPM_HASH = "c4395c53dc6132dc18feae3bbf5091d06183cff5a8f5214f0cf59710515c4394545810995f4770e224924059206774f52675566017c8b9e2a6a3a1d282a592a8"

RPROVIDES:${PN} += "perl(Devel::CheckLib) perl-Devel-CheckLib perl-Devel-CheckLib(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
