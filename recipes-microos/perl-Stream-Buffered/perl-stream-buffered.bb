SUMMARY = "temporary buffer to save bytes"
DESCRIPTION = "Stream::Buffered is a buffer class to store arbitrary length of byte \
strings and then get a seekable filehandle once everything is buffered. It \
uses PerlIO and/or temporary file to save the buffer depending on the \
length of the size."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.03"

RPM_NAME = "perl-Stream-Buffered-0.03-1.27.noarch.rpm"
RPM_HASH = "d589e6220b644c0211f2b97d86639cb2a8bcdc6ef039b814b5c49e15aaa8c1db58450bd9d2ef30cdcf494f41172e2806d2ade5675da5ee0c853c7d453b12d38c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Stream::Buffered) perl(Stream::Buffered::Auto) perl(Stream::Buffered::File) perl(Stream::Buffered::PerlIO) perl-Stream-Buffered"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(IO::File)"

inherit rpm
