SUMMARY = "Library files of Biber a BibTeX replacement"
DESCRIPTION = "Perl library files of Biber a BibTeX replacement for users of BibLaTeX. \
This package is required by the package texlive-biber-bin."
LICENSE = "LPPL-1.0"

PV = "2.19"

RPM_NAME = "perl-biber-2.19-89.1.noarch.rpm"
RPM_HASH = "8ea323e6ccf1dea6b540d6e5b89c4115c91115391fe0301940ba1fce2001e10d251b38e542034fbe9f1f1cd4b280b074802ccfb6f7a6df833781c2d5a05ffba3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Biber) perl(Biber::Annotation) perl(Biber::Config) perl(Biber::Constants) perl(Biber::DataList) perl(Biber::DataLists) perl(Biber::DataModel) perl(Biber::Date::Format) perl(Biber::Entries) perl(Biber::Entry) perl(Biber::Entry::FieldValue) perl(Biber::Entry::List) perl(Biber::Entry::Name) perl(Biber::Entry::Names) perl(Biber::Input::file::biblatexml) perl(Biber::Input::file::bibtex) perl(Biber::Internals) perl(Biber::LaTeX::Recode) perl(Biber::LangTag) perl(Biber::LangTags) perl(Biber::Output::base) perl(Biber::Output::bbl) perl(Biber::Output::bblxml) perl(Biber::Output::biblatexml) perl(Biber::Output::bibtex) perl(Biber::Output::dot) perl(Biber::Section) perl(Biber::Sections) perl(Biber::UCollate) perl(Biber::Utils) perl-biber"
RDEPENDS:${PN} += "perl(Business::ISBN) perl(Business::ISMN) perl(Business::ISSN) perl(Class::Accessor) perl(Data::Compare) perl(Data::Dump) perl(Data::Uniqid) perl(Date::Simple) perl(DateTime) perl(DateTime::Calendar::Julian) perl(DateTime::Format::Builder) perl(DateTime::TimeZone) perl(Encode::EUCJPASCII) perl(Encode::HanExtra) perl(Encode::JIS2K) perl(File::Slurp) perl(File::Slurp::Unicode) perl(File::Slurper) perl(IPC::Cmd) perl(IPC::Run3) perl(LWP::Protocol::https) perl(LWP::Simple) perl(List::AllUtils) perl(List::MoreUtils) perl(Log::Log4perl) perl(Regexp::Common) perl(Sort::Key) perl(Text::BibTeX) perl(Text::CSV) perl(Text::Roman) perl(URI) perl(Unicode::Collate) perl(Unicode::GCString) perl(XML::LibXML) perl(XML::LibXML::Simple) perl(XML::LibXSLT) perl(XML::Writer) perl(autovivification) perl-base"

inherit rpm
