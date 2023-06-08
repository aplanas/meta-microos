SUMMARY = "File path utility"
DESCRIPTION = "This module provides a small, fast utility for working with file paths. It \
is friendlier to use than File::Spec and provides easy access to functions \
from several other core file handling modules. It aims to be smaller and \
faster than many alternatives on CPAN, while helping people do many common \
things in consistent and less error-prone ways. \
 \
Path::Tiny does not try to work for anything except Unix-like and Win32 \
platforms. Even then, it might break if you try something particularly \
obscure or tortuous. (Quick! What does this mean: \
'///../../..//./././a//b/.././c/././'? And how does it differ on Win32?) \
 \
All paths are forced to have Unix-style forward slashes. Stringifying the \
object gives you back the path (after some clean up). \
 \
File input/output methods 'flock' handles before reading or writing, as \
appropriate (if supported by the platform and/or filesystem). \
 \
The '*_utf8' methods ('slurp_utf8', 'lines_utf8', etc.) operate in raw \
mode. On Windows, that means they will not have CRLF translation from the \
':crlf' IO layer. Installing Unicode::UTF8 0.58 or later will speed up \
'*_utf8' situations in many cases and is highly recommended. Alternatively, \
installing PerlIO::utf8_strict 0.003 or later will be used in place of the \
default ':encoding(UTF-8)'. \
 \
This module depends heavily on PerlIO layers for correct operation and thus \
requires Perl 5.008001 or later."
LICENSE = "Apache-2.0"

PV = "0.144"

RPM_NAME = "perl-Path-Tiny-0.144-1.2.noarch.rpm"
RPM_HASH = "70ee9c18f833a7990ecc28a355c2979f248f55c4c091532f39e6675e3fdd39860cf4b4446e871002bf3411431c188c0b2a0151397184c7e2aa14bb12aa9bfab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Path::Tiny) perl(Path::Tiny::Error) perl-Path-Tiny"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Digest::SHA) perl(File::Path) perl(File::Temp)"

inherit rpm
