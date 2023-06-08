SUMMARY = "Yet another Perl SAX XML Writer"
DESCRIPTION = "YAWriter implements Yet Another XML::Handler::Writer. The reasons for this \
one are that I needed a flexible escaping technique, and want some kind of \
pretty printing. If an instance of YAWriter is created without any options, \
the default behavior is to produce an array of strings containing the XML \
in : \
 \
  @{$ya->{Strings}}"
LICENSE = "GPL-1.0+"

PV = "0.23"

RPM_NAME = "perl-XML-Handler-YAWriter-0.23-5.26.noarch.rpm"
RPM_HASH = "dd10ac1f6b2cfb300b1cd100cf3f78eb57ab36f2f81883ea2287331fdef7ef2baef935b920d1b2bae91123ad2f3083ca034a760cb7bf594e4bfbd805449934f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(XML::Handler::YAWriter) perl-XML-Handler-YAWriter"
RDEPENDS:${PN} += "/usr/bin/perl perl(:MODULE_COMPAT_5.36.0) perl(XML::Parser::PerlSAX)"

inherit rpm
