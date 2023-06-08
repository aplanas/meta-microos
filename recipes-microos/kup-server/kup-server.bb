SUMMARY = "Kernel.org Uploader - server"
DESCRIPTION = "Kup is a file upload utility for kernel.org. It is designed to only accept \
cryptographically verified uploads from pre-authorized, trusted members."
LICENSE = "GPL-2.0+"

PV = "0.3.6"

RPM_NAME = "kup-server-0.3.6-1.14.aarch64.rpm"
RPM_HASH = "60ad35f0aa25be0bd9ebc0cfdf4d8d472581b6129c3b6544b32a1186fed7613c175d5b2786dfb7e700cf9ce1e59b35eddc4fe9129f72ee734e10ce732bb7a724"

RPROVIDES:${PN} += "kup-server kup-server(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl perl perl(BSD::Resource) perl(Config::Simple) perl(Digest::SHA) perl(Encode) perl(Fcntl) perl(File::Path) perl(File::Temp) perl(Git) perl(IO::Handle) perl(IPC::Open2) perl(POSIX) perl(Sys::Syslog)"

inherit rpm
