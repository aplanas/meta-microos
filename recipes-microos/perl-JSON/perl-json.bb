SUMMARY = "JSON (JavaScript Object Notation) encoder/decoder"
DESCRIPTION = "This module is a thin wrapper for JSON::XS-compatible modules with a few \
additional features. All the backend modules convert a Perl data structure \
to a JSON text and vice versa. This module uses JSON::XS by default, and \
when JSON::XS is not available, falls back on JSON::PP, which is in the \
Perl core since 5.14. If JSON::PP is not available either, this module then \
falls back on JSON::backportPP (which is actually JSON::PP in a different \
.pm file) bundled in the same distribution as this module. You can also \
explicitly specify to use Cpanel::JSON::XS, a fork of JSON::XS by Reini \
Urban. \
 \
All these backend modules have slight incompatibilities between them, \
including extra features that other modules don't support, but as long as \
you use only common features (most important ones are described below), \
migration from backend to backend should be reasonably easy. For details, \
see each backend module you use."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "4.10"

RPM_NAME = "perl-JSON-4.10-1.2.noarch.rpm"
RPM_HASH = "640e32d0b77667215cd2b1a15dec9468029f35e5155d7a884db49e3eebff02820531693bc1d38f756cecd651764bb9d2c9085328ea5e5983860d7958842500c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(JSON) \
perl(JSON::Backend::PP) \
perl-JSON"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
