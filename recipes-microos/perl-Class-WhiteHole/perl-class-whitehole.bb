SUMMARY = "Base class to treat unhandled method calls as errors"
DESCRIPTION = "It's possible to accidentally inherit an AUTOLOAD method. Often this \
will happen if a class somewhere in the chain uses AutoLoader or \
defines one of their own. This can lead to confusing error messages \
when method lookups fail. \
 \
Sometimes you want to avoid this accidental inheritance.  In that case, \
inherit from Class::WhiteHole. All unhandled methods will produce \
normal Perl error messages. \
 \
 \
 \
Authors: \
-------- \
    Michael G Schwern <schwern@pobox.com>"
LICENSE = "Artistic-1.0"

PV = "0.04"

RPM_NAME = "perl-Class-WhiteHole-0.04-228.29.aarch64.rpm"
RPM_HASH = "03883e77898027d3f48c73d5c6324526c9134c5650cdd05f45cbf1e58d3abc74fc798605505fdaa5eab63e48fcf407ed665976e3c98e128cc7f408992d13de70"

RPROVIDES:${PN} += "perl(Class::WhiteHole) \
perl-Class-WhiteHole \
perl-Class-WhiteHole(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
