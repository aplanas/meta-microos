SUMMARY = "XS for C++"
DESCRIPTION = "Anything that does not look like a XS++ directive or a class declaration is \
passed verbatim to XS. If you want XS++ to ignore code that looks like a \
XS++ directive or class declaration, simply surround it with a raw block \
delimiter like this: \
 \
  %{ \
  XS++ won't interpret this \
  %}"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.18"

RPM_NAME = "perl-ExtUtils-XSpp-0.18-3.24.aarch64.rpm"
RPM_HASH = "569006a250dbe209df4093675201e4989bb5900af5f09ff4cd3d5aa89611e213cead4b06add85b45e8e759aaab19d5c02c5aea04005f43882fa5500d427ef740"

RPROVIDES:${PN} += "perl(ExtUtils::XSpp) perl(ExtUtils::XSpp::Cmd) perl(ExtUtils::XSpp::Driver) perl(ExtUtils::XSpp::Exception) perl(ExtUtils::XSpp::Exception::code) perl(ExtUtils::XSpp::Exception::object) perl(ExtUtils::XSpp::Exception::perlcode) perl(ExtUtils::XSpp::Exception::simple) perl(ExtUtils::XSpp::Exception::stdmessage) perl(ExtUtils::XSpp::Exception::unknown) perl(ExtUtils::XSpp::Grammar) perl(ExtUtils::XSpp::Grammar::YappDriver) perl(ExtUtils::XSpp::Lexer) perl(ExtUtils::XSpp::Node) perl(ExtUtils::XSpp::Node::Access) perl(ExtUtils::XSpp::Node::Argument) perl(ExtUtils::XSpp::Node::Class) perl(ExtUtils::XSpp::Node::Comment) perl(ExtUtils::XSpp::Node::Constructor) perl(ExtUtils::XSpp::Node::Destructor) perl(ExtUtils::XSpp::Node::Enum) perl(ExtUtils::XSpp::Node::EnumValue) perl(ExtUtils::XSpp::Node::File) perl(ExtUtils::XSpp::Node::Function) perl(ExtUtils::XSpp::Node::Member) perl(ExtUtils::XSpp::Node::Method) perl(ExtUtils::XSpp::Node::Module) perl(ExtUtils::XSpp::Node::Package) perl(ExtUtils::XSpp::Node::PercAny) perl(ExtUtils::XSpp::Node::Preprocessor) perl(ExtUtils::XSpp::Node::Raw) perl(ExtUtils::XSpp::Node::Type) perl(ExtUtils::XSpp::Parser) perl(ExtUtils::XSpp::Plugin::feature::default_xs_typemap) perl(ExtUtils::XSpp::Typemap) perl(ExtUtils::XSpp::Typemap::parsed) perl(ExtUtils::XSpp::Typemap::reference) perl(ExtUtils::XSpp::Typemap::simple) perl(ExtUtils::XSpp::Typemap::wrapper) perl-ExtUtils-XSpp perl-ExtUtils-XSpp(aarch-64) xspp"
RDEPENDS:${PN} += "/usr/bin/perl gcc-c++ perl(:MODULE_COMPAT_5.36.0) perl(ExtUtils::ParseXS) perl(ExtUtils::Typemaps)"

inherit rpm
