SUMMARY = "Hashed Passwords/Passphrases As Objects"
DESCRIPTION = "This is the base class for a system of objects that encapsulate \
passphrases. An object of this type is a passphrase recogniser: its job is \
to recognise whether an offered passphrase is the right one. For security, \
such passphrase recognisers usually do not themselves know the passphrase \
they are looking for; they can merely recognise it when they see it. There \
are many schemes in use to achieve this effect, and the intent of this \
class is to provide a consistent interface to them all, hiding the details. \
 \
The CPAN package Authen-Passphrase contains implementations of several \
specific passphrase schemes in addition to the base class. See the specific \
classes for notes on the security properties of each scheme. In new \
systems, if there is a choice of which passphrase algorithm to use, it is \
recommended to use the Authen::Passphrase::SaltedDigest manpage or the \
Authen::Passphrase::BlowfishCrypt manpage. Most other schemes are too weak \
for new applications, and should be used only for backward compatibility."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.008"

RPM_NAME = "perl-Authen-Passphrase-0.008-1.22.noarch.rpm"
RPM_HASH = "42050deab63dd0ae5f8bb8feec22f65a2573ede97e83153e2fcd87c5cbb673fb310d48d4fd87fac61489ef8cd8beb6c46833ed99245b79b86116fce0392f7cf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Authen::Passphrase) perl(Authen::Passphrase::AcceptAll) perl(Authen::Passphrase::BigCrypt) perl(Authen::Passphrase::BlowfishCrypt) perl(Authen::Passphrase::Clear) perl(Authen::Passphrase::Crypt16) perl(Authen::Passphrase::DESCrypt) perl(Authen::Passphrase::EggdropBlowfish) perl(Authen::Passphrase::LANManager) perl(Authen::Passphrase::LANManagerHalf) perl(Authen::Passphrase::MD5Crypt) perl(Authen::Passphrase::MySQL323) perl(Authen::Passphrase::MySQL41) perl(Authen::Passphrase::NTHash) perl(Authen::Passphrase::NetscapeMail) perl(Authen::Passphrase::PHPass) perl(Authen::Passphrase::RejectAll) perl(Authen::Passphrase::SaltedDigest) perl(Authen::Passphrase::VMSPurdy) perl-Authen-Passphrase"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Authen::DecHpwd) perl(Crypt::DES) perl(Crypt::Eksblowfish::Bcrypt) perl(Crypt::Eksblowfish::Uklblowfish) perl(Crypt::MySQL) perl(Crypt::PasswdMD5) perl(Crypt::UnixCrypt_XS) perl(Data::Entropy::Algorithms) perl(Digest::MD4) perl(Digest::SHA) perl(Module::Runtime) perl(Params::Classify) perl(parent)"

inherit rpm
