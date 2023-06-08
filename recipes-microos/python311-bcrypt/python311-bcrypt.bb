SUMMARY = "BSD type 2a and 2b password hashing"
DESCRIPTION = "This Python module supports creating (and verifying) password hashes \
using the BSD-originating hashing methods known as '2a' and '2b'."
LICENSE = "Apache-2.0"

PV = "4.0.1"

RPM_NAME = "python311-bcrypt-4.0.1-2.1.aarch64.rpm"
RPM_HASH = "33b7fccd171c863036797ad79f05d92b1de0e6530727b031cdb7d1c83ea6cdb28f710b4df9bdd6415568dd4f4af9273130e56c03912701d68c55f8183a69f781"

RPROVIDES:${PN} += "python3.11dist(bcrypt) python311-bcrypt python311-bcrypt(aarch-64) python311-py-bcrypt python3dist(bcrypt)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) python(abi)"

inherit rpm
