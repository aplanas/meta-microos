SUMMARY = "Perl access to fsync() and sync() function calls"
DESCRIPTION = "The fsync() function takes a Perl file handle as its only argument, and \
passes its fileno() to the C function fsync(). It returns _undef_ on \
failure, or _true_ on success. \
 \
The fsync_fd() function is used internally by fsync(); it takes a file \
descriptor as its only argument. \
 \
The sync() function is identical to the C function sync(). \
 \
This module does *not* export any methods by default, but fsync() is made \
available as a method of the _FileHandle_ and _IO::Handle_ classes."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.11"

RPM_NAME = "perl-File-Sync-0.11-10.37.aarch64.rpm"
RPM_HASH = "4ea8ff188e5d143d71cfed44c75e6d8baf80a3745fa23551da443f9bf4306f1220f5219dd9b929ba78eedbedc5d4515a4c743af5fd64d3ed259b58efb838bc83"

RPROVIDES:${PN} += "perl(File::Sync) perl-File-Sync perl-File-Sync(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
