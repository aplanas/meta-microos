SUMMARY = "Table/Matrix Widget Extension to perl/tk"
DESCRIPTION = "Tk::TableMatrix is a table/matrix widget extension to perl/tk \
for displaying data in a table (or spreadsheet) format."
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & TCL"

PV = "1.29"

RPM_NAME = "perl-Tk-TableMatrix-1.29-1.3.aarch64.rpm"
RPM_HASH = "91d519464e6bd72d5835548dfcd1309eb310103921c331cb39ea5a965f18069ab102e4ee88cf7406c53bdb2fa34deae05fb5650baa1d98c6b89fa98276dc5ea3"

RPROVIDES:${PN} += "perl(Tk::TableMatrix) perl(Tk::TableMatrix::Spreadsheet) perl(Tk::TableMatrix::SpreadsheetHideRows) perl-Tk-TableMatrix perl-Tk-TableMatrix(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0) perl(Tk)"

inherit rpm
