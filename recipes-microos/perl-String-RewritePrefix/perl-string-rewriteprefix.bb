SUMMARY = "Rewrite strings based on a set of known prefixes"
DESCRIPTION = "rewrite strings based on a set of known prefixes"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.009"

RPM_NAME = "perl-String-RewritePrefix-0.009-1.2.noarch.rpm"
RPM_HASH = "f94e07b6a54da0772ac6af803747cbfb6199f4b67b523dbab25aae257a918c61359d26201bb9c22cac7c6c4f75d1c3479c673317a071d147d8dda3ebf56b6665"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(String::RewritePrefix) perl-String-RewritePrefix"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Sub::Exporter)"

inherit rpm
