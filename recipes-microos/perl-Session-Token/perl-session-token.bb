SUMMARY = "Secure, efficient, simple random session token generation"
DESCRIPTION = "This module provides a secure, efficient, and simple interface for creating \
session tokens, password reset codes, temporary passwords, random \
identifiers, and anything else you can think of. \
 \
When a Session::Token object is created, 1024 bytes are read from \
'/dev/urandom' (Linux, Solaris, most BSDs), '/dev/arandom' (some older \
BSDs), or Crypt::Random::Source::Strong::Win32 (Windows). These bytes are \
used to seed the at http://www.burtleburtle.net/bob/rand/isaacafa.html \
pseudo random number generator. \
 \
Once a generator is created, you can repeatedly call the 'get' method on \
the generator object and it will return a new token each time. \
 \
*IMPORTANT*: If your application calls 'fork', make sure that any \
generators are re-created in one of the processes after the fork since \
forking will duplicate the generator state and both parent and child \
processes will go on to produce identical tokens (just like perl's rand \
after it is seeded). \
 \
After the generator context is created, no system calls are used to \
generate tokens. This is one way that Session::Token helps with efficiency. \
However, this is only important for certain use cases (generally not web \
sessions). \
 \
ISAAC is a cryptographically secure PRNG that improves on the well-known \
RC4 algorithm in some important areas. For instance, it doesn't have short \
cycles or initial bias like RC4 does. A theoretical shortest possible cycle \
in ISAAC is '2**40', although no cycles this short have ever been found \
(and probably don't exist at all). On average, ISAAC cycles are '2**8295'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.503"

RPM_NAME = "perl-Session-Token-1.503-1.14.aarch64.rpm"
RPM_HASH = "514b533026e790e68c59a8c49ec372685ddf62692b7610f749a583d49d6e0fe6af3f11b2315d3885be0d468a74e4d9a45a718a9e9100642af5b262ac3896b19b"

RPROVIDES:${PN} += "perl(Session::Token) perl-Session-Token perl-Session-Token(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
