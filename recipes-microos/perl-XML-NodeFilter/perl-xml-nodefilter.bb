SUMMARY = "XML::NodeFilter"
DESCRIPTION = "XML::NodeFilter is a generic node filter class for DOM traversal as \
specified in the DOM Level 2 Traversal and Range specification. It \
extends that specification, so this class is easier to use for Perl \
programmers."
LICENSE = "Artistic-1.0"

PV = "0.01"

RPM_NAME = "perl-XML-NodeFilter-0.01-194.29.aarch64.rpm"
RPM_HASH = "6f1ca1a5efca282e190424cb68a96e703ef194099e08d4939f56cf7040e4ad5f5e2a203d4da83b72306c5c26d2854866ec8a97aa6ed56f08eb4994febb6cbf17"

RPROVIDES:${PN} += "perl(XML::NodeFilter) \
perl-XML-NodeFilter \
perl-XML-NodeFilter(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
