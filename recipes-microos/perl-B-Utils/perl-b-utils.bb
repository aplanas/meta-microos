SUMMARY = "Helper functions for op tree manipulation"
DESCRIPTION = "Helper functions for op tree manipulation"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.27"

RPM_NAME = "perl-B-Utils-0.27-1.36.aarch64.rpm"
RPM_HASH = "05e9840be5b3ccfbb13028c59c49ad76ef531d35504b9b69558d5541b04fdfc9a26ed4836faa4bb8533a834c835f9e92560b4f7dc717c455c6692cf131b1eb81"

RPROVIDES:${PN} += "perl(B::Utils) perl(B::Utils::Install::Files) perl(B::Utils::OP) perl-B-Utils perl-B-Utils(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0) perl(Task::Weaken)"

inherit rpm
