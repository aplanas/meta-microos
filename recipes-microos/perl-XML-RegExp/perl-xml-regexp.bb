SUMMARY = "Regular expressions for XML tokens"
DESCRIPTION = "This package contains regular expressions for the following XML tokens: \
BaseChar, Ideographic, Letter, Digit, Extender, CombiningChar, NameChar, \
EntityRef, CharRef, Reference, Name, NmToken, and AttValue. \
 \
The definitions of these tokens were taken from the XML spec (Extensible \
Markup Language 1.0) at the http://www.w3.org/TR/REC-xml manpage. \
 \
Also contains the regular expressions for the following tokens from the XML \
Namespaces spec at the http://www.w3.org/TR/REC-xml-names manpage: \
NCNameChar, NCName, QName, Prefix and LocalPart."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.04"

RPM_NAME = "perl-XML-RegExp-0.04-9.26.noarch.rpm"
RPM_HASH = "1a2d9db8118dd5d2f7e30a6d664af837f7633d0bf31f64a881c16e45ca179cdad616a126abf06d580150f2684ec70aab165770bd326f7e70be822e035215e40b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(XML::RegExp) perl-XML-RegExp"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
