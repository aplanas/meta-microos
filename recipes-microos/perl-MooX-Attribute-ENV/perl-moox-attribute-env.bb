SUMMARY = "Allow Moo attributes to get their values from %ENV"
DESCRIPTION = "This is a Moo extension. It allows other attributes for Moo/has. If any of \
these are given, then Moo/BUILDARGS is wrapped so that values for object \
attributes can, if not supplied in the normal construction process, come \
from the environment. \
 \
The environment will be searched for either the given case, or upper case, \
version of the names discussed below. \
 \
When a prefix is mentioned, it will be prepended to the mentioned name, \
with a '_' in between."
LICENSE = "Artistic-2.0"

PV = "0.04"

RPM_NAME = "perl-MooX-Attribute-ENV-0.04-1.8.noarch.rpm"
RPM_HASH = "02e620234c77860dc21556cd5b4b4b4e04ca4a0d75bcfe659aa34e9fbaa2d14c949084cb7fedd381f8efd92f146b3652485eba6aee32520db23694634ba04122"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooX::Attribute::ENV) perl-MooX-Attribute-ENV"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Moo)"

inherit rpm
