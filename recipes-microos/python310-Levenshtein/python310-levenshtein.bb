SUMMARY = "Python extension computing string distances and similarities"
DESCRIPTION = "The Levenshtein Python C extension module contains functions for fast \
computation of \
 \
 * Levenshtein (edit) distance, and edit operations \
 * string similarity \
 * approximate median strings, and generally string averaging \
 * string sequence and set similarity \
 \
It supports both normal and Unicode strings."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.0"

RPM_NAME = "python310-Levenshtein-0.12.0-4.19.aarch64.rpm"
RPM_HASH = "2a7420d9971f78e129193a8c0c40ef1e19885fbd97a03151ae5c49663d56a246ae4d28d085227af2e43bf13dbbd2d6c24763d74b669b2b2f09956a1a98952e38"

RPROVIDES:${PN} += "python3-Levenshtein \
python3.10dist(python-levenshtein) \
python310-Levenshtein \
python310-Levenshtein(aarch-64) \
python3dist(python-levenshtein)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
