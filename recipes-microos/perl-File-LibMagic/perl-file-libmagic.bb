SUMMARY = "Determine MIME types of data or files using libmagic"
DESCRIPTION = "The 'File::LibMagic' module is a simple perl interface to libmagic from the \
file package (version 4.x or 5.x). You will need both the library \
(_libmagic.so_) and the header file (_magic.h_) to build this Perl module."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.23"

RPM_NAME = "perl-File-LibMagic-1.23-1.15.aarch64.rpm"
RPM_HASH = "7baea3c52e80fdb225965b48c030edf5ae98a2e5228dbc9e4f9f501857b5c4884b570d5b07803f5fa917bc27be49c981f34e186266141dc334acef4c973810d1"

RPROVIDES:${PN} += "perl(File::LibMagic) perl(File::LibMagic::Constants) perl-File-LibMagic perl-File-LibMagic(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libmagic.so.1()(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
