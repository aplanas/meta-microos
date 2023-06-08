SUMMARY = "De-/serialize() PHP output into Perl"
DESCRIPTION = "Provides a simple, quick means of serializing perl memory structures \
(including object data!) into a format that PHP can deserialize() and \
access, and vice versa. \
 \
NOTE: Converts PHP arrays into Perl Arrays when the PHP array used \
exclusively numeric indexes, and into Perl Hashes then the PHP array did \
not."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.34"

RPM_NAME = "perl-PHP-Serialization-0.34-13.26.noarch.rpm"
RPM_HASH = "cfaefcc33b46d009b85575f87a2371c96c8385317d056f832cd23c8acd634111a2a0abbc1f6a3bae6de06a57d530aef01b01686c28b36d1a986c9defa9e49ce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(PHP::Serialization) perl(PHP::Serialization::Object) perl-PHP-Serialization"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
