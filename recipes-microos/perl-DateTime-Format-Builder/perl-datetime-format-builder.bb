SUMMARY = "Create DateTime parser classes and objects"
DESCRIPTION = "DateTime::Format::Builder creates DateTime parsers. Many string formats of \
dates and times are simple and just require a basic regular expression to \
extract the relevant information. Builder provides a simple way to do this \
without writing reams of structural code. \
 \
Builder provides a number of methods, most of which you'll never need, or \
at least rarely need. They're provided more for exposing of the module's \
innards to any subclasses, or for when you need to do something slightly \
beyond what I expected."
LICENSE = "Artistic-2.0"

PV = "0.83"

RPM_NAME = "perl-DateTime-Format-Builder-0.83-1.13.noarch.rpm"
RPM_HASH = "eba9bf4631bb36d1ee7594d9de3a632511aa2c52c5bf041bc55c4c73dff237b75d110c6a2a69aa0be63d8b795ed36b04ebfe8ab24d8dd670982f63f88150fce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DateTime::Format::Builder) perl(DateTime::Format::Builder::Parser) perl(DateTime::Format::Builder::Parser::Dispatch) perl(DateTime::Format::Builder::Parser::Quick) perl(DateTime::Format::Builder::Parser::Regex) perl(DateTime::Format::Builder::Parser::Strptime) perl(DateTime::Format::Builder::Parser::generic) perl-DateTime-Format-Builder"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(DateTime) perl(DateTime::Format::Strptime) perl(Params::Validate) perl(parent)"

inherit rpm
