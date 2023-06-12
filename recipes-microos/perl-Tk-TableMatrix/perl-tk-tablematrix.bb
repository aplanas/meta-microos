SUMMARY = "Table/Matrix Widget Extension to perl/tk"
DESCRIPTION = "Tk::TableMatrix is a table/matrix widget extension to perl/tk \
for displaying data in a table (or spreadsheet) format."
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & TCL"

PV = "1.29"

RPM_NAME = "perl-Tk-TableMatrix-1.29-2.1.aarch64.rpm"
RPM_HASH = "f06523728fbb40a7ffb245638d32ec21325cf4d5c5d17e5c2ef9f08fd666e4cd5ca0cdf2f068d48b7df1801f0184e91195b184a6952a8c9af3d57c63ba2ec82c"

RPROVIDES:${PN} += "perl(Tk::TableMatrix) \
perl(Tk::TableMatrix::Spreadsheet) \
perl(Tk::TableMatrix::SpreadsheetHideRows) \
perl-Tk-TableMatrix \
perl-Tk-TableMatrix(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(Tk)"

inherit rpm
