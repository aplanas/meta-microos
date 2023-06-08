SUMMARY = "Simple factory objects for SAX namespaced names."
DESCRIPTION = "Simply create a new XML::NamespaceFactory object with the namespace you \
wish to use as its single parameter. If you wish to use the empty \
namespace, simply pass in an empty string (but undef will not do). \
 \
Then, when you want to get a JClark name, call a method on that object the \
name of which is the local name you wish to have. It'll return the JClark \
notation for that local name in your namespace. \
 \
Unfortunately, some local names legal in XML are not legal in Perl. To \
circumvent this, you can use the hash notation in which you access a key on \
the object the name of which is the local name you wish to have. This will \
work just as the method call name but will accept more characters. Note \
that it does not check that the name you ask for is a valid XML name. This \
form is more general but slower. \
 \
If this is not clear, hopefully the SYNOPSIS should help :)"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.02"

RPM_NAME = "perl-XML-NamespaceFactory-1.02-1.26.noarch.rpm"
RPM_HASH = "36c6ef73f929595908c4705877d13ecefbf3a56e83423c49b3d72a422f00f434d7c26d28192bf1f4f12ac1539f4dd60e8e4a04d5d133a3e9d5790d37016d147c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(XML::NamespaceFactory) perl(XML::NamespaceFactory::TiedHash) perl-XML-NamespaceFactory"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
