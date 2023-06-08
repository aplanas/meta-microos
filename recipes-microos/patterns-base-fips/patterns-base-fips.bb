SUMMARY = "FIPS 140-2 specific packages"
DESCRIPTION = "This pattern installs the FIPS 140-2 specific packages that complete the various \
cryptographic modules in use. It is required if you want to run the \
machine with 'fips=1'. \
 \
Please note that this pattern only enables FIPS 140-2 compliant operation, it does \
not directly make the system FIPS 140-2 certified nor validated. \
 \
Please refer to SUSE official statements on the state of FIPS 140-2 certification."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-fips-20200505-40.1.aarch64.rpm"
RPM_HASH = "b997148f5dc8a0ec409c15ee5d7f9d38b8553349dd9f0225ca60d0cd10a774f11218f3db11eb67bb420492a840d34648a246d316f63bca9a26edfbcad531a865"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-base-fips patterns-base-fips(aarch-64) patterns-server-enterprise-fips patterns-server-enterprise-fips-32bit patterns-sles-fips"
RDEPENDS:${PN} += "(dracut-fips if dracut) (libcryptsetup12-hmac if libcryptsetup12) (libcryptsetup12-hmac-32bit if libcryptsetup12-32bit) (libfreebl3-hmac if libfreebl3) (libfreebl3-hmac-32bit if libfreebl3-32bit) (libgcrypt20-hmac if libgcrypt20) (libgnutls30-hmac if libgnutls30) (libgnutls30-hmac-32bit if libgnutls30-32bit) (libopenssl1_0_0-hmac if libopenssl1_0_0) (libopenssl1_0_0-hmac-32bit if libopenssl1_0_0-32bit) (libopenssl1_1-hmac if libopenssl1_1) (libopenssl1_1-hmac-32bit if libopenssl1_1-32bit) (libsoftokn3-hmac if libsoftokn3) (libsoftokn3-hmac-32bit if libsoftokn3-32bit) (openssh-fips if openssh-clients) (openssh-fips if openssh-server) (strongswan-hmac if strongswan)"

inherit rpm
