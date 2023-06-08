SUMMARY = "Comma-separated values manipulator (using XS or PurePerl)"
DESCRIPTION = "Text::CSV is a thin wrapper for Text::CSV_XS-compatible modules now. All \
the backend modules provide facilities for the composition and \
decomposition of comma-separated values. Text::CSV uses Text::CSV_XS by \
default, and when Text::CSV_XS is not available, falls back on \
Text::CSV_PP, which is bundled in the same distribution as this module."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.02"

RPM_NAME = "perl-Text-CSV-2.02-1.2.noarch.rpm"
RPM_HASH = "3f086b5481dc4cb65306f095b821f381ed9c7e7bf4c69b335b4d279f423ea7f3feda23489e361005e1de861e52a7b1699b1b4d1d8d2a0d5f63803229a1bea220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Text::CSV) perl(Text::CSV::ErrorDiag) perl(Text::CSV_PP) perl-Text-CSV"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Test::More)"

inherit rpm
