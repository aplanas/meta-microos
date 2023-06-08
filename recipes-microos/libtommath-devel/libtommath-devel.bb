SUMMARY = "Development files for LibTomMath"
DESCRIPTION = "Headers and other development files for TomMath library. \
 \
LibTomMath provides highly optimized and portable routines for a vast \
majority of integer based number theoretic applications (including public \
key cryptography). LibTomMath is not a cryptographic toolkit itself but it \
can be used to write one [Used in LibTomCrypt for RSA, DH and ECC public key \
routines]."
LICENSE = "Unlicense"

PV = "1.2.0"

RPM_NAME = "libtommath-devel-1.2.0-2.2.aarch64.rpm"
RPM_HASH = "0c30e4633ea45fd61214846b9f353bba78e10481ad796e6135d6b77827dc982bc167321011b67bf3c7330aa9b4d074247b93bd8bfd05f7066d722f960ba904b5"

RPROVIDES:${PN} += "libtommath-devel libtommath-devel(aarch-64) libtommath0-devel pkgconfig(libtommath)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libtommath1"

inherit rpm
