SUMMARY = "HTML to PostScript Converter"
DESCRIPTION = "An HTML to PostScript converter written in Perl.  Html2ps understands \
many of the HTML 4.0 features.	From the home page \
(http://www.tdb.uu.se/~jan/html2ps.html): \
 \
* Many ways to control the appearance; this is mostly done using \
   configuration files. \
* Support for processing multiple documents, can be done \
   automatically by recursively following links. \
* A table of contents can be generated, either from the links in a \
   document or automatically from document headings. \
* Configurable page headers and footers that can, for example, \
   contain document title, URL, page number, current heading, and \
   date. \
* Automatic hyphenation and text justification can be selected."
LICENSE = "GPL-2.0+"

PV = "1.0b5"

RPM_NAME = "html2ps-1.0b5-248.14.noarch.rpm"
RPM_HASH = "4a4776547c6fff2fa832c84cf618a0b01332593fc3a0ffe4b1e8011b737140afda70d9407eaa326e27d2652af1a5181621e8aa43296c0a826662735bd68d7b24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(html2ps) html2ps"
RDEPENDS:${PN} += "/usr/bin/wish ImageMagick ghostscript_any netpbm perl perl-libwww-perl"

inherit rpm
