SUMMARY = "Extract OpenOffice 1.x spreadsheet data"
DESCRIPTION = "Spreadsheet::ReadSXC extracts data from OpenOffice 1.x spreadsheet files \
(.sxc). It exports the function read_sxc() which takes a filename and an \
optional reference to a hash of options as arguments and returns a \
reference to a hash of references to two-dimensional arrays. The hash keys \
correspond to the names of worksheets in the OpenOffice workbook. The \
two-dimensional arrays correspond to rows and cells in the respective \
spreadsheets. If you don't like this because the order of sheets is not \
preserved in a hash, read on. The 'OrderBySheet' option provides an array \
of hashes instead. \
 \
If you prefer to unpack the .sxc file yourself, you can use the function \
read_xml_file() instead and pass the path to content.xml as an argument. Or \
you can extract the XML string from content.xml and pass the string to the \
function read_xml_string(). Both functions also take a reference to a hash \
of options as an optional second argument. \
 \
Spreadsheet::ReadSXC uses XML::Twig to parse the XML contained in .sxc \
files. Only the contents of text:p elements are returned, not the actual \
values of table:value attributes. For example, a cell might have a \
table:value-type attribute of 'currency', a table:value attribute of \
'-1500.99' and a table:currency attribute of 'USD'. The text:p element \
would contain '-$1,500.99'. This is the string which is returned by the \
read_sxc() function, not the value of -1500.99. \
 \
Spreadsheet::ReadSXC was written with data import into an SQL database in \
mind. Therefore empty spreadsheet cells correspond to undef values in array \
rows. The example code above shows how to replace undef values with empty \
strings. \
 \
If the .sxc file contains an empty spreadsheet its hash element will point \
to an empty array (unless you use the 'NoTruncate' option in which case it \
will point to an array of an array containing one undefined element). \
 \
OpenOffice uses UTF-8 encoding. It depends on your environment how the data \
returned by the XML Parser is best handled: \
 \
  use Unicode::String qw(latin1 utf8); \
  $unicode_string = utf8($$workbook_ref{'Sheet1'}[0][0])->as_string; \
 \
   \
 \
  $latin1_string = utf8($$workbook_ref{'Sheet1'}[0][0])->latin1; \
 \
Of course there are other modules than Unicode::String on CPAN that handle \
conversion between encodings. It's your choice. \
 \
Table rows in .sxc files may have a 'table:number-rows-repeated' attribute, \
which is often used for consecutive empty rows. When you format whole rows \
and/or columns in OpenOffice, it sets the numbers of rows in a worksheet to \
32,000 and the number of columns to 256, even if only a few lower-numbered \
rows and cells actually contain data. Spreadsheet::ReadSXC truncates such \
sheets so that there are no empty rows after the last row containing data \
and no empty columns after the last column containing data (unless you use \
the 'NoTruncate' option). \
 \
Still it is perfectly legal for an .sxc file to apply the \
'table:number-rows-repeated' attribute to rows that actually contain data \
(although I have only been able to produce such files manually, not through \
OpenOffice itself). To save on memory usage in these cases, \
Spreadsheet::ReadSXC does not copy rows by value, but by reference \
(remember that multi-dimensional arrays in Perl are really arrays of \
references to arrays). Therefore, if you change a value in one row, it is \
possible that you find the corresponding value in the next row changed, \
too: \
 \
  $$workbook_ref{'Sheet1'}[0][0] = 'new string'; \
  print $$workbook_ref{'Sheet1'}[1][0]; \
 \
As of version 0.20 the references returned by read_sxc() et al. remain \
valid after subsequent calls to the same function. In earlier versions, \
calling read_sxc() with a different file as the argument would change the \
data referenced by the original return value, so you had to derefence it \
before making another call. Thanks to H. Merijn Brand for fixing this."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.37"

RPM_NAME = "perl-Spreadsheet-ReadSXC-0.37-1.8.noarch.rpm"
RPM_HASH = "ebe163ede1a3b6034b1b6f9057f156a18e316c409d43f44de7cab2b5811b55d0baabe31c624c3ab0b76d0ed391fcbe5f6fb17eda22cd8dc2843c053dd639e322"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Spreadsheet::ParseODS) perl(Spreadsheet::ParseODS::Cell) perl(Spreadsheet::ParseODS::Settings) perl(Spreadsheet::ParseODS::Styles) perl(Spreadsheet::ParseODS::Workbook) perl(Spreadsheet::ParseODS::Worksheet) perl(Spreadsheet::ReadSXC) perl-Spreadsheet-ReadSXC"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Archive::Zip) perl(Moo) perl(PerlIO::gzip) perl(PerlX::Maybe) perl(XML::Twig) perl(XML::Twig::XPath) perl(XML::XPath) perl(XML::XPathEngine)"

inherit rpm
