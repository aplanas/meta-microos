SUMMARY = "Encrypt Data with Cipher Block Chaining Mode"
DESCRIPTION = "This module is a Perl-only implementation of the cryptographic cipher block \
chaining mode (CBC). In combination with a block cipher such as AES or \
Blowfish, you can encrypt and decrypt messages of arbitrarily long length. \
The encrypted messages are compatible with the encryption format used by \
the *OpenSSL* package. \
 \
To use this module, you will first create a Crypt::CBC cipher object with \
new(). At the time of cipher creation, you specify an encryption key to use \
and, optionally, a block encryption algorithm. You will then call the \
start() method to initialize the encryption or decryption process, crypt() \
to encrypt or decrypt one or more blocks of data, and lastly finish(), to \
pad and encrypt the final block. For your convenience, you can call the \
encrypt() and decrypt() methods to operate on a whole data value at once."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.04"

RPM_NAME = "perl-Crypt-CBC-3.04-1.9.noarch.rpm"
RPM_HASH = "9285ea4677feab6dd938f347c4fc3603e1d6eb27845604d0bbca472aec16b5e215d2836f3c3a9db5df684fc11d16d1adc08ddc3a040e6efab62042642434f253"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Crypt::CBC) perl(Crypt::CBC::PBKDF) perl(Crypt::CBC::PBKDF::none) perl(Crypt::CBC::PBKDF::opensslv1) perl(Crypt::CBC::PBKDF::opensslv2) perl(Crypt::CBC::PBKDF::pbkdf2) perl(Crypt::CBC::PBKDF::randomiv) perl-Crypt-CBC"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Crypt::Cipher::AES) perl(Crypt::PBKDF2) perl(Digest::SHA)"

inherit rpm
