SUMMARY = "Perl extension for Berkeley DB version 2, 3, 4, 5 or 6"
DESCRIPTION = "*NOTE: This document is still under construction. Expect it to be \
incomplete in places.* \
 \
This Perl module provides an interface to most of the functionality \
available in Berkeley DB versions 2, 3, 5 and 6. In general it is safe to \
assume that the interface provided here to be identical to the Berkeley DB \
interface. The main changes have been to make the Berkeley DB API work in a \
Perl way. Note that if you are using Berkeley DB 2.x, the new features \
available in Berkeley DB 3.x or later are not available via this module. \
 \
The reader is expected to be familiar with the Berkeley DB documentation. \
Where the interface provided here is identical to the Berkeley DB library \
and the... TODO \
 \
The *db_appinit*, *db_cursor*, *db_open* and *db_txn* man pages are \
particularly relevant. \
 \
The interface to Berkeley DB is implemented with a number of Perl classes."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.65"

RPM_NAME = "perl-BerkeleyDB-0.65-1.6.aarch64.rpm"
RPM_HASH = "99b72aca5f288d52be47019ac28fea9fb068a28bc7d5cec4f16c17c463ae73fe797a29be8c6657e5369a36650c1e29d8d425c823b063a414692c28b868842aaa"

RPROVIDES:${PN} += "perl(BerkeleyDB) \
perl(BerkeleyDB::Btree) \
perl(BerkeleyDB::CDS::Lock) \
perl(BerkeleyDB::Common) \
perl(BerkeleyDB::Cursor) \
perl(BerkeleyDB::Env) \
perl(BerkeleyDB::Hash) \
perl(BerkeleyDB::Heap) \
perl(BerkeleyDB::Queue) \
perl(BerkeleyDB::Recno) \
perl(BerkeleyDB::Term) \
perl(BerkeleyDB::Txn) \
perl(BerkeleyDB::TxnMgr) \
perl(BerkeleyDB::Unknown) \
perl(BerkeleyDB::_tiedArray) \
perl(BerkeleyDB::_tiedHash) \
perl-BerkeleyDB \
perl-BerkeleyDB(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdb-4.8.so()(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
