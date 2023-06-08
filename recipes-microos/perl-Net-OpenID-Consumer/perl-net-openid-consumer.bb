SUMMARY = "Library for consumers of OpenID identities"
DESCRIPTION = "This is the Perl API for (the consumer half of) OpenID, a distributed \
identity system based on proving you own a URL, which is then your \
identity. More information is available at: \
 \
  http://openid.net/"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.18"

RPM_NAME = "perl-Net-OpenID-Consumer-1.18-1.24.noarch.rpm"
RPM_HASH = "5ca6669230c34c0ce9b6e1413991c90dc864692d78eb7cb08caae86aed9218cd936751765e58be0f2cd9ebfd7eee90e4d70bc8366bcc0c3163f5bee8c8ddfcfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Net::OpenID::Association) perl(Net::OpenID::ClaimedIdentity) perl(Net::OpenID::Consumer) perl(Net::OpenID::VerifiedIdentity) perl-Net-OpenID-Consumer"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Digest::SHA) perl(HTTP::Request) perl(JSON) perl(LWP::UserAgent) perl(Net::OpenID::Common) perl(URI)"

inherit rpm
