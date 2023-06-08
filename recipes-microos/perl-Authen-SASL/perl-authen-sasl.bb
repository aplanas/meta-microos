SUMMARY = "SASL Authentication framework"
DESCRIPTION = "SASL is a generic mechanism for authentication used by several network \
protocols. *Authen::SASL* provides an implementation framework that all \
protocols should be able to share. \
 \
The framework allows different implementations of the connection class to \
be plugged in. At the time of writing there were two such plugins. \
 \
* Authen::SASL::Perl \
 \
This module implements several mechanisms and is implemented entirely in \
Perl. \
 \
* Authen::SASL::XS \
 \
This module uses the Cyrus SASL C-library (both version 1 and 2 are \
supported). \
 \
* Authen::SASL::Cyrus \
 \
This module is the predecessor to Authen::SASL::XS. It is reccomended to \
use Authen::SASL::XS \
 \
By default the order in which these plugins are selected is \
Authen::SASL::XS, Authen::SASL::Cyrus and then Authen::SASL::Perl. \
 \
If you want to change it or want to specifically use one implementation \
only simply do \
 \
 use Authen::SASL qw(Perl); \
 \
or if you have another plugin module that supports the Authen::SASL API \
 \
 use Authen::SASL qw(My::SASL::Plugin);"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.16"

RPM_NAME = "perl-Authen-SASL-2.16-6.21.noarch.rpm"
RPM_HASH = "b50ffbd0ee8e4cb50981f04b876a7b2230afb8152230ee2fd7dd0d54fafe879edbc3bb9a1ecd32cff3711011f7b65991f9be059fd9a06b9e86a8a91b6b565dea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Authen::SASL) perl(Authen::SASL::CRAM_MD5) perl(Authen::SASL::EXTERNAL) perl(Authen::SASL::Perl) perl(Authen::SASL::Perl::ANONYMOUS) perl(Authen::SASL::Perl::CRAM_MD5) perl(Authen::SASL::Perl::DIGEST_MD5) perl(Authen::SASL::Perl::EXTERNAL) perl(Authen::SASL::Perl::GSSAPI) perl(Authen::SASL::Perl::LOGIN) perl(Authen::SASL::Perl::Layer) perl(Authen::SASL::Perl::PLAIN) perl-Authen-SASL"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Digest::HMAC_MD5)"

inherit rpm
