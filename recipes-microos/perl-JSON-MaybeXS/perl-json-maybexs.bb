SUMMARY = "Use Cpanel::JSON::XS with a fallback to JSON::XS and JSON::PP"
DESCRIPTION = "This module first checks to see if either Cpanel::JSON::XS or JSON::XS (at \
at least version 3.0) is already loaded, in which case it uses that module. \
Otherwise it tries to load Cpanel::JSON::XS, then JSON::XS, then JSON::PP \
in order, and either uses the first module it finds or throws an error. \
 \
It then exports the 'encode_json' and 'decode_json' functions from the \
loaded module, along with a 'JSON' constant that returns the class name for \
calling 'new' on. \
 \
If you're writing fresh code rather than replacing JSON.pm usage, you might \
want to pass options as constructor args rather than calling mutators, so \
we provide our own 'new' method that supports that."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.004005"

RPM_NAME = "perl-JSON-MaybeXS-1.004005-1.1.noarch.rpm"
RPM_HASH = "929dc6c9a699114bf77d3b89bcd43b8b2f1766a597b1c642bf60054275a8498210b9fe0326a288d2d2c460a7245d453cbb879e540cd7c06bd611ecd3adf603ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(JSON::MaybeXS) perl-JSON-MaybeXS"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Cpanel::JSON::XS) perl(JSON::PP)"

inherit rpm
