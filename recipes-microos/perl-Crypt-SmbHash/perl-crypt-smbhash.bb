SUMMARY = "perl module Crypt::SmbHash"
DESCRIPTION = "This module provides functions to generate LM/NT hashes as used by \
Samba"
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"

PV = "0.12"

RPM_NAME = "perl-Crypt-SmbHash-0.12-159.15.noarch.rpm"
RPM_HASH = "fd79089a4d44c481663d74409efc16204260daa8c2a8e0105d0a1bc802ba4e34d0f430e0f2d35676330597fb004d8e68e2abcd8125f8052935f3033c4126cbcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Crypt::SmbHash) perl-Crypt-SmbHash"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl-Digest-MD4"

inherit rpm
