SUMMARY = "Base class for HTML formatters"
DESCRIPTION = "Base class for HTML formatters"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.12"

RPM_NAME = "perl-HTML-Format-2.12-1.17.noarch.rpm"
RPM_HASH = "22033abf3ff36ec275ec936499dba8b282051c6bc794a73d4d40190e2630110c6cb21f1a14497828ef6fd93a57f13e76e21401b0dfdad49ae3a56068fbb770a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTML::FormatMarkdown) perl(HTML::FormatPS) perl(HTML::FormatRTF) perl(HTML::FormatText) perl(HTML::Formatter) perl-HTML-Format"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Font::Metrics::Courier) perl(Font::Metrics::CourierBold) perl(Font::Metrics::CourierBoldOblique) perl(Font::Metrics::CourierOblique) perl(Font::Metrics::Helvetica) perl(Font::Metrics::HelveticaBold) perl(Font::Metrics::HelveticaBoldOblique) perl(Font::Metrics::HelveticaOblique) perl(Font::Metrics::TimesBold) perl(Font::Metrics::TimesBoldItalic) perl(Font::Metrics::TimesItalic) perl(Font::Metrics::TimesRoman) perl(HTML::Element) perl(HTML::TreeBuilder) perl(parent)"

inherit rpm
