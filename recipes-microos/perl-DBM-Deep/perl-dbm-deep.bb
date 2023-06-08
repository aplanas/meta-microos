SUMMARY = "Pure Perl Multi-Level Hash/Array Dbm That Supports Transactions"
DESCRIPTION = "A unique flat-file database module, written in pure perl. True multi-level \
hash/array support (unlike MLDBM, which is faked), hybrid OO / tie() \
interface, cross-platform FTPable files, ACID transactions, and is quite \
fast. Can handle millions of keys and unlimited levels without significant \
slow-down. Written from the ground-up in pure perl -- this is NOT a wrapper \
around a C-based DBM. Out-of-the-box compatibility with Unix, Mac OS X and \
Windows."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.0016"

RPM_NAME = "perl-DBM-Deep-2.0016-1.17.noarch.rpm"
RPM_HASH = "54b88e7869e268f7c4d73c1782418b2ed1f8fbec489f157281b2bde5403e161b7371b84f75a478aab0bc47f124fce8b4033805f573ce97f662fd50ae08be0e52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DBM::Deep) perl(DBM::Deep::Array) perl(DBM::Deep::ConfigData) perl(DBM::Deep::Engine) perl(DBM::Deep::Engine::DBI) perl(DBM::Deep::Engine::File) perl(DBM::Deep::Hash) perl(DBM::Deep::Iterator) perl(DBM::Deep::Iterator::DBI) perl(DBM::Deep::Iterator::File) perl(DBM::Deep::Iterator::File::BucketList) perl(DBM::Deep::Iterator::File::Index) perl(DBM::Deep::Null) perl(DBM::Deep::Sector) perl(DBM::Deep::Sector::DBI) perl(DBM::Deep::Sector::DBI::Reference) perl(DBM::Deep::Sector::DBI::Scalar) perl(DBM::Deep::Sector::File) perl(DBM::Deep::Sector::File::BucketList) perl(DBM::Deep::Sector::File::Data) perl(DBM::Deep::Sector::File::Index) perl(DBM::Deep::Sector::File::Null) perl(DBM::Deep::Sector::File::Reference) perl(DBM::Deep::Sector::File::Scalar) perl(DBM::Deep::Storage) perl(DBM::Deep::Storage::DBI) perl(DBM::Deep::Storage::File) perl-DBM-Deep"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
