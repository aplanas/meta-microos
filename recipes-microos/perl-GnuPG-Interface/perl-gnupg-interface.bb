SUMMARY = "Perl interface to GnuPG"
DESCRIPTION = "GnuPG::Interface and its associated modules are designed to provide an \
object-oriented method for interacting with GnuPG, being able to perform \
functions such as but not limited to encrypting, signing, decryption, \
verification, and key-listing parsing."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.02"

RPM_NAME = "perl-GnuPG-Interface-1.02-1.10.noarch.rpm"
RPM_HASH = "930d632faf68ffa7b6e6a5f8208b373d629395d0a195a50f546fe763cb27c33e8a8b596d7d3fe20803279c48d8567b1dcf3e2090e1cab66f1035efd745fdaca1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(GnuPG::Fingerprint) perl(GnuPG::Handles) perl(GnuPG::HashInit) perl(GnuPG::Interface) perl(GnuPG::Key) perl(GnuPG::Options) perl(GnuPG::PrimaryKey) perl(GnuPG::PublicKey) perl(GnuPG::Revoker) perl(GnuPG::SecretKey) perl(GnuPG::Signature) perl(GnuPG::SubKey) perl(GnuPG::UserAttribute) perl(GnuPG::UserId) perl-GnuPG-Interface"
RDEPENDS:${PN} += "gpg2 perl(:MODULE_COMPAT_5.36.0) perl(Math::BigInt) perl(Moo) perl(MooX::HandlesVia) perl(MooX::late)"

inherit rpm
