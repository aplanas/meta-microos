SUMMARY = "Perl module for safe concurrent access to MLDBM databases"
DESCRIPTION = "This module wraps around the MLDBM interface, by handling concurrent \
access to MLDBM databases with file locking, and flushes i/o explicity \
per lock/unlock. The new [Read]Lock()/UnLock() API can be used to \
serialize requests logically and improve performance for bundled reads \
& writes."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.30"

RPM_NAME = "perl-MLDBM-Sync-0.30-408.40.aarch64.rpm"
RPM_HASH = "4aabeb42448f88e5ca814c6c6c70ceada45cd1abfc015bd97f396edede98c7ff2ff02e53280ff823efd79d6075f9ff632871fca53ef5fd99ba342f7856541ad0"

RPROVIDES:${PN} += "perl(MLDBM::Sync) perl(MLDBM::Sync::SDBM_File) perl-MLDBM-Sync perl-MLDBM-Sync(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl-MLDBM perl-Tie-Cache"

inherit rpm
