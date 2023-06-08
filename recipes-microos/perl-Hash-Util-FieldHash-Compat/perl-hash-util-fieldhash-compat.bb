SUMMARY = "Use Hash::Util::FieldHash or ties, depending on availability"
DESCRIPTION = "Under older perls this module provides a drop-in compatible API to \
Hash::Util::FieldHash using perltie. When Hash::Util::FieldHash is \
available it will use that instead. \
 \
This way code requiring field hashes can benefit from fast, robust field \
hashes on Perl 5.10 and newer, but still run on older perls that don't ship \
with that module. \
 \
See Hash::Util::FieldHash for all the details of the API."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-Hash-Util-FieldHash-Compat-0.11-1.23.noarch.rpm"
RPM_HASH = "699d05c37c44336d575141e86f1e22939ec28ab4e8bf173798e8c3bb31f29b653e2f7fd1de9339aac799c13a9c6006f57bbe577a513b495fecb6e2c3455f8462"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Hash::Util::FieldHash::Compat) perl(Hash::Util::FieldHash::Compat::Heavy) perl-Hash-Util-FieldHash-Compat"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(parent)"

inherit rpm
