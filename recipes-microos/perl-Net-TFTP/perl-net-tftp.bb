SUMMARY = "TFTP Client class"
DESCRIPTION = "'Net::TFTP' is a class implementing a simple _Trivial File Transfer \
Protocol_ client in Perl as described in RFC1350. 'Net::TFTP' also supports \
the TFTP Option Extension (as described in RFC2347), with the following \
options \
 \
 RFC2348 Blocksize Option"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.1901"

RPM_NAME = "perl-Net-TFTP-0.1901-1.23.noarch.rpm"
RPM_HASH = "40888155807c3dfe6ccca6e39b8b1f27ed816016f76a49eb703450156a56153494e1e67a11376ca4442a1653c2fd64a7f5c0bfbd13444cc881e0d2c2482b388d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Net::TFTP) perl(Net::TFTP::IO) perl-Net-TFTP"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Test::MockModule) perl(Test::More) perl(Test::Warn)"

inherit rpm
