SUMMARY = "Alternative regular expression module for Python"
DESCRIPTION = "An alternate regex implementation. It differs from 're' in that \
 \
* Zero-width matches are handled like in Perl and PCRE: \
  * ``.split`` will split a string at a zero-width match. \
  * ``.sub`` will handle zero-width matches correctly. \
* Inline flags apply to the end of the group or pattern, and they can \
  be turned off. \
* Nested sets and set operations are supported. \
* Case-insensitive matches in Unicode use full case-folding by \
  default."
LICENSE = "Apache-2.0"

PV = "2023.3.23"

RPM_NAME = "python310-regex-2023.3.23-2.1.aarch64.rpm"
RPM_HASH = "180854d07a8cc103267a3c1adb8d763c552fdeda0b34056b4547ff8e456c9fc334ce6e701d8dd0b4f303d6bd501b1bc5149e952e3729da1489075223695c6cf7"

RPROVIDES:${PN} += "python3-regex python3.10dist(regex) python310-regex python310-regex(aarch-64) python3dist(regex)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
