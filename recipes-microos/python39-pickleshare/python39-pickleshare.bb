SUMMARY = "Tiny shelve-like database with concurrency support"
DESCRIPTION = "PickleShare - a small 'shelve' like datastore with concurrency support \
 \
Like shelve, a PickleShareDB object acts like a normal dictionary. Unlike shelve, \
many processes can access the database simultaneously. Changing a value in \
database is immediately visible to other processes accessing the same database. \
 \
Concurrency is possible because the values are stored in separate files. Hence \
the 'database' is a directory where *all* files are governed by PickleShare. \
 \
This module is certainly not ZODB, but can be used for low-load \
(non-mission-critical) situations where tiny code size trumps the \
advanced features of a 'real' object database. \
 \
Installation guide: pip install path pickleshare"
LICENSE = "MIT"

PV = "0.7.5"

RPM_NAME = "python39-pickleshare-0.7.5-5.1.noarch.rpm"
RPM_HASH = "de9417ffdb055abc8296d5d479a157e1e555206c01d860126fca7a7ef2ce5c90e4affa7b1b9480c3bbce32b4f2f27cb59c6d2adbded5bcffd8fd84fc649b8b6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pickleshare) python39-pickleshare python3dist(pickleshare)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
