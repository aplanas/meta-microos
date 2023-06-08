SUMMARY = "Perl bindings for the libsolv library"
DESCRIPTION = "Perl bindings for libsolv."
LICENSE = "BSD-3-Clause"

PV = "0.7.24"

RPM_NAME = "perl-solv-0.7.24-1.1.aarch64.rpm"
RPM_HASH = "5238584d37954d9c6cc0a1f8c0947eaf2c31181edfa6da50234045f920a588004bfa76a97b14e76a1891c9c863bd26f3fce05ab80ab8950f9925d40a589b6d7d"

RPROVIDES:${PN} += "perl(solv) perl(solv::Alternative) perl(solv::Chksum) perl(solv::Dataiterator) perl(solv::Datamatch) perl(solv::Datapos) perl(solv::Decision) perl(solv::Decisionset) perl(solv::Dep) perl(solv::Job) perl(solv::Pool) perl(solv::Pool_repo_iterator) perl(solv::Pool_solvable_iterator) perl(solv::Problem) perl(solv::Repo) perl(solv::Repo_solvable_iterator) perl(solv::Ruleinfo) perl(solv::Selection) perl(solv::Solution) perl(solv::Solutionelement) perl(solv::SolvFp) perl(solv::Solver) perl(solv::Solvsig) perl(solv::Transaction) perl(solv::TransactionClass) perl(solv::XRepodata) perl(solv::XRule) perl(solv::XSolvable) perl(solvc) perl-solv perl-solv(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.33)(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) librpm.so.9()(64bit) librpmio.so.9()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.3.3)(64bit) libzstd.so.1()(64bit) perl"

inherit rpm
