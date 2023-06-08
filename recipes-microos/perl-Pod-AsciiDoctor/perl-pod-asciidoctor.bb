SUMMARY = "Convert from POD to AsciiDoc"
DESCRIPTION = "Convert from POD to AsciiDoc"
LICENSE = "Apache-2.0"

PV = "0.1"

RPM_NAME = "perl-Pod-AsciiDoctor-0.1-1.8.noarch.rpm"
RPM_HASH = "c048e6b0fdf30e40ebc060f3687189dc6cb485efc6164166f2dd1b32b48d622d13cc99f1d8562652257cc64886e94f5c44f8b785ff68394db0ff870b65df8a15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Pod::AsciiDoctor) perl-Pod-AsciiDoctor"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
