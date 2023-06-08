SUMMARY = "Support for the SSH 2 protocol via libssh2"
DESCRIPTION = "Net::SSH2 is a Perl interface to the libssh2 (http://www.libssh2.org) \
library. It supports the SSH2 protocol (there is no support for SSH1) with \
all of the key exchanges, ciphers, and compression of libssh2. \
 \
Even if the module can be compiled and linked against very old versions of \
the library, nothing below 1.5.0 should really be used (older versions were \
quite buggy and unreliable) and version 1.7.0 or later is recommended."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.73"

RPM_NAME = "perl-Net-SSH2-0.73-1.3.aarch64.rpm"
RPM_HASH = "9dbd50057b6e52fbcf3246f1b430938e807cde4927b508a3dffcf597765d7c8af8b122743a6aef3f365851ba520efc07f80816d55c19e096b34445e7895f44f2"

RPROVIDES:${PN} += "perl(Net::SSH2) perl(Net::SSH2::Channel) perl(Net::SSH2::Dir) perl(Net::SSH2::File) perl(Net::SSH2::KnownHosts) perl(Net::SSH2::Listener) perl(Net::SSH2::PublicKey) perl(Net::SSH2::SFTP) perl-Net-SSH2 perl-Net-SSH2(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libssh2.so.1()(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
