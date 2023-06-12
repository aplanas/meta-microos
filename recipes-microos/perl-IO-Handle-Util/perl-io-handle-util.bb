SUMMARY = "Functions for working with L<IO::Handle> like objects"
DESCRIPTION = "This module provides a number of helpful routines to manipulate or create \
IO::Handle like objects."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.02"

RPM_NAME = "perl-IO-Handle-Util-0.02-1.17.noarch.rpm"
RPM_HASH = "ec8fd7aa32a4980c9dd06811ee2a94fda0420fb88c43dc2bb0c5d46fc3a05805748faea94bbf5c5aa214d0e5bdb876baa2a50e1d5cfcdb14ddbefaecfcfef7ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(IO::Handle::Iterator) \
perl(IO::Handle::Iterator::Buffered) \
perl(IO::Handle::Prototype) \
perl(IO::Handle::Prototype::Fallback) \
perl(IO::Handle::Util) \
perl(IO::Handle::Util::Overloading) \
perl(IO::Handle::Util::Tie) \
perl-IO-Handle-Util"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(IO::String) \
perl(Sub::Exporter) \
perl(asa) \
perl(autodie) \
perl(parent)"

inherit rpm
