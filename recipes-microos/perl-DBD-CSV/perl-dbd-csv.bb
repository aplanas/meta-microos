SUMMARY = "DBI driver for CSV files"
DESCRIPTION = "The DBD::CSV module is yet another driver for the DBI (Database independent \
interface for Perl). This one is based on the SQL 'engine' SQL::Statement \
and the abstract DBI driver DBD::File and implements access to so-called \
CSV files (Comma Separated Values). Such files are often used for exporting \
MS Access and MS Excel data. \
 \
See DBI for details on DBI, SQL::Statement for details on SQL::Statement \
and DBD::File for details on the base class DBD::File."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.60"

RPM_NAME = "perl-DBD-CSV-0.60-1.1.noarch.rpm"
RPM_HASH = "4d9dbf9e63ef0c896a6e2fdde000113196948307360ba0e549c3794f66e7f5e85d19068d82953190420cdd8e20fc2ee11b3e90fb3ba840937152e2d6ebd616ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Bundle::DBD::CSV) \
perl(DBD::CSV) \
perl(DBD::CSV::GetInfo) \
perl(DBD::CSV::Statement) \
perl(DBD::CSV::Table) \
perl(DBD::CSV::TypeInfo) \
perl(DBD::CSV::db) \
perl(DBD::CSV::dr) \
perl(DBD::CSV::st) \
perl-DBD-CSV"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(DBD::File) \
perl(DBI) \
perl(SQL::Statement) \
perl(Test::More) \
perl(Text::CSV_XS)"

inherit rpm
