SUMMARY = "Simple Generic Namespace Processor"
DESCRIPTION = "This module offers a simple to process namespaced XML names (unames) from \
within any application that may need them. It also helps maintain a prefix \
to namespace URI map, and provides a number of basic checks. \
 \
The model for this module is SAX2's NamespaceSupport class, readable at \
http://www.saxproject.org/namespaces.html It adds a few perlisations where \
we thought it appropriate."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.12"

RPM_NAME = "perl-XML-NamespaceSupport-1.12-1.23.noarch.rpm"
RPM_HASH = "4fad8194449901685a6491c2f6c6d2f9f5b1791f5509b75feff137479cd4efa5500d65747c699f2532738fbaf2d39f3b62454f1896c356a92c0a3f5152275b95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(XML::NamespaceSupport) perl-XML-NamespaceSupport"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
