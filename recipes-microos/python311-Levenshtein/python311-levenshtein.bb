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

RPM_NAME = "python311-Levenshtein-0.12.0-4.19.aarch64.rpm"
RPM_HASH = "1e8a1082a6a6880df8e19481bcce29193af723629b983d2d74fdd48b05948a089ac5808441ad76ee4d136af9782d694d7f95b14d831e0ad061b2f363032e8cc7"

RPROVIDES:${PN} += "python3.11dist(python-levenshtein) python311-Levenshtein python311-Levenshtein(aarch-64) python3dist(python-levenshtein)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
