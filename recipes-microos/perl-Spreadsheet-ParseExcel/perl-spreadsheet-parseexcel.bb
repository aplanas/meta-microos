SUMMARY = "Read information from an Excel file."
DESCRIPTION = "The Spreadsheet::ParseExcel module can be used to read information from \
Excel 95-2003 binary files. \
 \
The module cannot read files in the Excel 2007 Open XML XLSX format. See \
the the Spreadsheet::XLSX manpage module instead."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.65"

RPM_NAME = "perl-Spreadsheet-ParseExcel-0.65-3.26.noarch.rpm"
RPM_HASH = "1bdbc555dbbc33284e1877b3a037d14dc98f3cdc50dcfa640c488a71153a4e07cb7cf14d1b4c40bce51ee8cf7641cbd172161fc6e66c60e088ed55d6c578ee28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Spreadsheet::ParseExcel) perl(Spreadsheet::ParseExcel::Cell) perl(Spreadsheet::ParseExcel::Dump) perl(Spreadsheet::ParseExcel::FmtDefault) perl(Spreadsheet::ParseExcel::FmtJapan) perl(Spreadsheet::ParseExcel::FmtJapan2) perl(Spreadsheet::ParseExcel::FmtUnicode) perl(Spreadsheet::ParseExcel::Font) perl(Spreadsheet::ParseExcel::Format) perl(Spreadsheet::ParseExcel::SaveParser) perl(Spreadsheet::ParseExcel::SaveParser::Workbook) perl(Spreadsheet::ParseExcel::SaveParser::Worksheet) perl(Spreadsheet::ParseExcel::Utility) perl(Spreadsheet::ParseExcel::Workbook) perl(Spreadsheet::ParseExcel::Worksheet) perl-Spreadsheet-ParseExcel"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Crypt::RC4) perl(Digest::Perl::MD5) perl(IO::Scalar) perl(OLE::Storage_Lite)"

inherit rpm
