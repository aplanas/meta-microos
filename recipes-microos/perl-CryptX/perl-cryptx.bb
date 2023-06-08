SUMMARY = "Cryptographic toolkit"
DESCRIPTION = "Perl modules providing a cryptography based on at \
https://github.com/libtom/libtomcrypt library. \
 \
* * Symmetric ciphers - see Crypt::Cipher and related modules \
 \
Crypt::Cipher::AES, Crypt::Cipher::Anubis, Crypt::Cipher::Blowfish, \
Crypt::Cipher::Camellia, Crypt::Cipher::CAST5, Crypt::Cipher::DES, \
Crypt::Cipher::DES_EDE, Crypt::Cipher::IDEA, Crypt::Cipher::KASUMI, \
Crypt::Cipher::Khazad, Crypt::Cipher::MULTI2, Crypt::Cipher::Noekeon, \
Crypt::Cipher::RC2, Crypt::Cipher::RC5, Crypt::Cipher::RC6, \
Crypt::Cipher::SAFERP, Crypt::Cipher::SAFER_K128, Crypt::Cipher::SAFER_K64, \
Crypt::Cipher::SAFER_SK128, Crypt::Cipher::SAFER_SK64, Crypt::Cipher::SEED, \
Crypt::Cipher::Serpent, Crypt::Cipher::Skipjack, Crypt::Cipher::Twofish, \
Crypt::Cipher::XTEA \
 \
* * Block cipher modes \
 \
Crypt::Mode::CBC, Crypt::Mode::CFB, Crypt::Mode::CTR, Crypt::Mode::ECB, \
Crypt::Mode::OFB \
 \
* * Stream ciphers \
 \
Crypt::Stream::RC4, Crypt::Stream::ChaCha, Crypt::Stream::Salsa20, \
Crypt::Stream::Sober128, Crypt::Stream::Sosemanuk, Crypt::Stream::Rabbit \
 \
* * Authenticated encryption modes \
 \
Crypt::AuthEnc::CCM, Crypt::AuthEnc::EAX, Crypt::AuthEnc::GCM, \
Crypt::AuthEnc::OCB, Crypt::AuthEnc::ChaCha20Poly1305 \
 \
* * Hash Functions - see Crypt::Digest and related modules \
 \
Crypt::Digest::BLAKE2b_160, Crypt::Digest::BLAKE2b_256, \
Crypt::Digest::BLAKE2b_384, Crypt::Digest::BLAKE2b_512, \
Crypt::Digest::BLAKE2s_128, Crypt::Digest::BLAKE2s_160, \
Crypt::Digest::BLAKE2s_224, Crypt::Digest::BLAKE2s_256, \
Crypt::Digest::CHAES, Crypt::Digest::MD2, Crypt::Digest::MD4, \
Crypt::Digest::MD5, Crypt::Digest::RIPEMD128, Crypt::Digest::RIPEMD160, \
Crypt::Digest::RIPEMD256, Crypt::Digest::RIPEMD320, Crypt::Digest::SHA1, \
Crypt::Digest::SHA224, Crypt::Digest::SHA256, Crypt::Digest::SHA384, \
Crypt::Digest::SHA512, Crypt::Digest::SHA512_224, \
Crypt::Digest::SHA512_256, Crypt::Digest::Tiger192, \
Crypt::Digest::Whirlpool, Crypt::Digest::Keccak224, \
Crypt::Digest::Keccak256, Crypt::Digest::Keccak384, \
Crypt::Digest::Keccak512, Crypt::Digest::SHA3_224, Crypt::Digest::SHA3_256, \
Crypt::Digest::SHA3_384, Crypt::Digest::SHA3_512, Crypt::Digest::SHAKE \
 \
* * Checksums \
 \
Crypt::Checksum::Adler32, Crypt::Checksum::CRC32 \
 \
* * Message Authentication Codes \
 \
Crypt::Mac::BLAKE2b, Crypt::Mac::BLAKE2s, Crypt::Mac::F9, Crypt::Mac::HMAC, \
Crypt::Mac::OMAC, Crypt::Mac::Pelican, Crypt::Mac::PMAC, Crypt::Mac::XCBC, \
Crypt::Mac::Poly1305 \
 \
* * Public key cryptography \
 \
Crypt::PK::RSA, Crypt::PK::DSA, Crypt::PK::ECC, Crypt::PK::DH, \
Crypt::PK::Ed25519, Crypt::PK::X25519 \
 \
* * Cryptographically secure random number generators - see Crypt::PRNG and \
  related modules \
 \
Crypt::PRNG::Fortuna, Crypt::PRNG::Yarrow, Crypt::PRNG::RC4, \
Crypt::PRNG::Sober128, Crypt::PRNG::ChaCha20 \
 \
* * Key derivation functions - PBKDF1, PBKDF2 and HKDF \
 \
Crypt::KeyDerivation \
 \
* * Other handy functions related to cryptography \
 \
Crypt::Misc"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.078"

RPM_NAME = "perl-CryptX-0.078-1.1.aarch64.rpm"
RPM_HASH = "5d126489ecca29a6ad44de7aa22f6c35598119f415f13a1be914142ae0ea5732be1f983287a184450de12491af652cb7cbffd65879ca9c1bb295eda471505ac3"

RPROVIDES:${PN} += "perl(Crypt::AuthEnc) perl(Crypt::AuthEnc::CCM) perl(Crypt::AuthEnc::ChaCha20Poly1305) perl(Crypt::AuthEnc::EAX) perl(Crypt::AuthEnc::GCM) perl(Crypt::AuthEnc::OCB) perl(Crypt::Checksum) perl(Crypt::Checksum::Adler32) perl(Crypt::Checksum::CRC32) perl(Crypt::Cipher) perl(Crypt::Cipher::AES) perl(Crypt::Cipher::Anubis) perl(Crypt::Cipher::Blowfish) perl(Crypt::Cipher::CAST5) perl(Crypt::Cipher::Camellia) perl(Crypt::Cipher::DES) perl(Crypt::Cipher::DES_EDE) perl(Crypt::Cipher::IDEA) perl(Crypt::Cipher::KASUMI) perl(Crypt::Cipher::Khazad) perl(Crypt::Cipher::MULTI2) perl(Crypt::Cipher::Noekeon) perl(Crypt::Cipher::RC2) perl(Crypt::Cipher::RC5) perl(Crypt::Cipher::RC6) perl(Crypt::Cipher::SAFERP) perl(Crypt::Cipher::SAFER_K128) perl(Crypt::Cipher::SAFER_K64) perl(Crypt::Cipher::SAFER_SK128) perl(Crypt::Cipher::SAFER_SK64) perl(Crypt::Cipher::SEED) perl(Crypt::Cipher::Serpent) perl(Crypt::Cipher::Skipjack) perl(Crypt::Cipher::Twofish) perl(Crypt::Cipher::XTEA) perl(Crypt::Digest) perl(Crypt::Digest::BLAKE2b_160) perl(Crypt::Digest::BLAKE2b_256) perl(Crypt::Digest::BLAKE2b_384) perl(Crypt::Digest::BLAKE2b_512) perl(Crypt::Digest::BLAKE2s_128) perl(Crypt::Digest::BLAKE2s_160) perl(Crypt::Digest::BLAKE2s_224) perl(Crypt::Digest::BLAKE2s_256) perl(Crypt::Digest::CHAES) perl(Crypt::Digest::Keccak224) perl(Crypt::Digest::Keccak256) perl(Crypt::Digest::Keccak384) perl(Crypt::Digest::Keccak512) perl(Crypt::Digest::MD2) perl(Crypt::Digest::MD4) perl(Crypt::Digest::MD5) perl(Crypt::Digest::RIPEMD128) perl(Crypt::Digest::RIPEMD160) perl(Crypt::Digest::RIPEMD256) perl(Crypt::Digest::RIPEMD320) perl(Crypt::Digest::SHA1) perl(Crypt::Digest::SHA224) perl(Crypt::Digest::SHA256) perl(Crypt::Digest::SHA384) perl(Crypt::Digest::SHA3_224) perl(Crypt::Digest::SHA3_256) perl(Crypt::Digest::SHA3_384) perl(Crypt::Digest::SHA3_512) perl(Crypt::Digest::SHA512) perl(Crypt::Digest::SHA512_224) perl(Crypt::Digest::SHA512_256) perl(Crypt::Digest::SHAKE) perl(Crypt::Digest::Tiger192) perl(Crypt::Digest::Whirlpool) perl(Crypt::KeyDerivation) perl(Crypt::Mac) perl(Crypt::Mac::BLAKE2b) perl(Crypt::Mac::BLAKE2s) perl(Crypt::Mac::F9) perl(Crypt::Mac::HMAC) perl(Crypt::Mac::OMAC) perl(Crypt::Mac::PMAC) perl(Crypt::Mac::Pelican) perl(Crypt::Mac::Poly1305) perl(Crypt::Mac::XCBC) perl(Crypt::Misc) perl(Crypt::Mode) perl(Crypt::Mode::CBC) perl(Crypt::Mode::CFB) perl(Crypt::Mode::CTR) perl(Crypt::Mode::ECB) perl(Crypt::Mode::OFB) perl(Crypt::PK) perl(Crypt::PK::DH) perl(Crypt::PK::DSA) perl(Crypt::PK::ECC) perl(Crypt::PK::Ed25519) perl(Crypt::PK::RSA) perl(Crypt::PK::X25519) perl(Crypt::PRNG) perl(Crypt::PRNG::ChaCha20) perl(Crypt::PRNG::Fortuna) perl(Crypt::PRNG::RC4) perl(Crypt::PRNG::Sober128) perl(Crypt::PRNG::Yarrow) perl(Crypt::Stream::ChaCha) perl(Crypt::Stream::RC4) perl(Crypt::Stream::Rabbit) perl(Crypt::Stream::Salsa20) perl(Crypt::Stream::Sober128) perl(Crypt::Stream::Sosemanuk) perl(CryptX) perl(Math::BigInt::LTM) perl-CryptX perl-CryptX(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.25)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
