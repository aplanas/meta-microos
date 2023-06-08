SUMMARY = "Meta-Wrapper for reading spreadsheet data"
DESCRIPTION = "Spreadsheet::Read tries to transparently read *any* spreadsheet and return \
its content in a universal manner independent of the parsing module that \
does the actual spreadsheet scanning. \
 \
For OpenOffice this module uses Spreadsheet::ReadSXC \
 \
For Microsoft Excel this module uses Spreadsheet::ParseExcel or \
Spreadsheet::XLSX \
 \
For CSV this module uses Text::CSV_XS (0.29 or up required, 0.73 or up \
preferred) or Text::CSV_PP (1.05 or up required). \
 \
For SquirrelCalc there is a very simplistic built-in parser"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.87"

RPM_NAME = "perl-Spreadsheet-Read-0.87-1.1.noarch.rpm"
RPM_HASH = "b9ccd4f58494a3e77077d71b588893da05401ffaadcd3919f62d8933142e4cbf5cf4a1f99a11c8434e490f3a37f2ebddbb5e4bab40103157bf28395a24238328"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Spreadsheet::Read) perl(Spreadsheet::Read::Attribute) perl(Spreadsheet::Read::Sheet) perl(Z10::Just::For::Testing) perl(Z20::Just::For::Testing) perl-Spreadsheet-Read"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Data::Peek) perl(File::Temp) perl(IO::Scalar) perl(Test::More) perl(Test::NoWarnings)"

inherit rpm
