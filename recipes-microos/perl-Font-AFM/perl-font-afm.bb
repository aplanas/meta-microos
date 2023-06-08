SUMMARY = "Interface to Adobe Font Metrics Files"
DESCRIPTION = "This module implements the Font::AFM class. Objects of this class are \
initialized from an AFM file and allow you to obtain information about \
the font and the metrics of the various glyphs in the font."
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"

PV = "1.20"

RPM_NAME = "perl-Font-AFM-1.20-51.15.noarch.rpm"
RPM_HASH = "dc45f7a7e1ce0efa14fd91f8e9f85b230cef7334e2ffad7a4d2faae10f01c07306ec89a9fa825b2bcfc90800f6c336a9edce1f63645c2425bcb7ab2ff5c63c36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Font::AFM) perl(Font::Metrics::Courier) perl(Font::Metrics::CourierBold) perl(Font::Metrics::CourierBoldOblique) perl(Font::Metrics::CourierOblique) perl(Font::Metrics::Helvetica) perl(Font::Metrics::HelveticaBold) perl(Font::Metrics::HelveticaBoldOblique) perl(Font::Metrics::HelveticaOblique) perl(Font::Metrics::TimesBold) perl(Font::Metrics::TimesBoldItalic) perl(Font::Metrics::TimesItalic) perl(Font::Metrics::TimesRoman) perl-Font-AFM"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
