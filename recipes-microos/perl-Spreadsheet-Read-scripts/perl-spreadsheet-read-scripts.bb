SUMMARY = "Scripts to Work with Spreadsheets"
DESCRIPTION = "This package includes some scripts to work with spreadsheets."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.87"

RPM_NAME = "perl-Spreadsheet-Read-scripts-0.87-1.1.noarch.rpm"
RPM_HASH = "4bf05095d53b37cbc88daff063866ba8f5c5cd8192cc7e477a3e425294f87deec0b54ccaeaf3b6f95bfeced013cd69fa275480492cfde1bc295e85b010920cfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Spreadsheet-Read-scripts"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(HTML::Entities) \
perl(Spreadsheet::Read) \
perl(Term::ReadKey) \
perl(Text::CSV_XS) \
perl(Tk) \
perl(Tk::TableMatrix::Spreadsheet)"

inherit rpm
